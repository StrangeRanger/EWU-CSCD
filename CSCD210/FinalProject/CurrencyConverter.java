import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CurrencyConverter {
    public static void main(String[] args) {
        /* [ Module Wide Variables ]************************************************* */
        Scanner       userInput       = new Scanner(System.in);
        JSONObject    conversionRates = (JSONObject) getAPIData("USD");
        DecimalFormat df              = new DecimalFormat("#.##");  // Format output.
        String        base, nonBase;
        double        baseValue, nonBaseValue, amount;
        final String  RED    = "\033[1;31m";  // String color becomes red.
        final String  DEFCLR = "\033[0m";     // String color gets reset.

        /* [ Main ]****************************************************************** */

        df.setRoundingMode(
                RoundingMode.HALF_EVEN);  // Set rounding method for final output.

        System.out.println(
                "IMPORTANT NOTES:\n1) When entering a currency, "
                + "enter it's short handed name (i.e. US Dollar = USD, Japanese "
                + "yen = JPY, etc.");
        System.out.println(
                "2) All available currencies (as of 2020-12-7):\n"
                + "    AUD = Australian dollar   |  BGN = Bulgarian lev\n"
                + "    BRL = Brazilian real      |  CAD = Canadian dollar\n"
                + "    CHF = Swiss franc         |  CNY = Chinese yuan renminbi\n"
                + "    CZK = Czech koruna        |  DKK = Danish krone\n"
                + "    GBP = Pound sterling      |  HKD = Hong Kong dollar\n"
                + "    HRK = Croatian kuna       |  HUF = Hungarian forint\n"
                + "    ILS = Israeli shekel      |  INR = Indian rupee\n"
                + "    ISK = Icelandic krona     |  JPY = Japanese yen\n"
                + "    KRW = South Korean won    |  MXN = Mexican peso\n"
                + "    MYR = Malaysian ringgit   |  NOK = Norwegian krone\n"
                + "    NZD = New Zealand dollar  |  PHP = Philippine peso\n"
                + "    PLN = Polish zloty        |  RON = Romanian leu\n"
                + "    RUB = Russian rouble      |  SEK = Swedish krona\n"
                + "    SGD = Singapore dollar    |  THB = Thai baht\n"
                + "    TRY = Turkish lira        |  USD = US dollar\n"
                + "    ZAR = South African rand\n");

        while (true) {
            System.out.print("Enter base currency to be converted: ");
            base = userInput.nextLine().toUpperCase();

            // A. Checks if a valid base currency is provided.
            if (conversionRates.get(base)
                != null) {  // B. Null produced if base not found.
                conversionRates = (JSONObject) getAPIData(base);
                baseValue       = (double) conversionRates.get(base);
                break;
            } else {
                System.out.printf("%sInvalid input: Enter a valid base "
                                          + "currency%s\n",
                                  RED, DEFCLR);
            }
        }

        while (true) {
            System.out.print("Enter currency to convert the base currency to: ");
            nonBase = userInput.nextLine().toUpperCase();

            // A.
            if (conversionRates.get(nonBase) != null) {  // B.
                nonBaseValue = (double) conversionRates.get(nonBase);
                break;
            } else {
                System.out.printf("%sInvalid input: Enter a valid "
                                          + "currency%s\n",
                                  RED, DEFCLR);
            }
        }

        System.out.println("Note: Input will be rounded to two decimals");
        while (true) {
            try {
                System.out.print("Enter an amount to be converted: ");
                // Parses Double to df converting 'amount' to a string.
                amount = Double.parseDouble(df.format(userInput.nextDouble()));
                break;
            } catch (Exception e) {
                System.out.printf("%sInvalid input: Only numbers are "
                                          + "accepted as input%s\n",
                                  RED, DEFCLR);
            }
        }

        System.out.printf("\nConversion rates\n%s: %f\n%s: %f\n\n", base, baseValue,
                          nonBase, nonBaseValue);
        System.out.printf("Note: Output rounded to two decimals\nConverted "
                                  + "currency approximate: %s %s",
                          df.format(amount * nonBaseValue), nonBase);
    }

    /**
     * Retrieves the currency conversion rates from an API
     * (https://api.exchangeratesapi.io/latest).
     *
     * @param baseCurrency The currency that will act as the base value when retrieving
     *                     conversion rates for that currency (comes from user input).
     * @return Object      All the conversion rates located in the 'rates' key of the
     *                     retrieved json.
     *
     * @NOTES The code in this module has been modified to suite my needs. You can find
     *        the original code at the site below.
     *        Source:
     *        https://medium.com/swlh/getting-json-data-from-a-restful-api-using-java-b327aafb3751
     * @NOTES I tried for nearly half a day to figure this out on my own, which includes
     *        figuring out how to get the necessary library to even do this section. So
     *        I ended up resorting to grabbing then making slight modification to the
     *        code, created by someone else.
     */
    public static Object getAPIData(String baseCurrency) {
        try {
            String tmpURL =
                    "https://api.exchangeratesapi.io/latest?base=" + (baseCurrency);
            URL url = new URL(tmpURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Getting the response code.
            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder inline = new StringBuilder();
                Scanner userInput    = new Scanner(url.openStream());

                // Write all the JSON data into a string using a scanner.
                while (userInput.hasNext()) {
                    inline.append(userInput.nextLine());
                }

                // Close the scanner.
                userInput.close();

                // Using the JSON simple library parse the string into a json object.
                JSONParser parse    = new JSONParser();
                JSONObject data_obj = (JSONObject) parse.parse(inline.toString());

                // Return the required object from the above created object.
                return data_obj.get("rates");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
