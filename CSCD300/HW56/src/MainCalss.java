/**
 * Author:      Hunter T.
 * Description: Main class.
 */

import java.io.File;
import java.io.PrintStream;

/** Main class. */
public class MainCalss {
    /** Main method. */
    public static void main(String[] args) throws Exception {
        PrintStream fileStream = new PrintStream(new File("hw5_output.txt"));
        String[] infixArray    = {"(((A + B) - (C - D)) / (E - F))",
                                  "(((A)))",
                                  "(A)",
                                  "((A",
                                  "(B",
                                  "D)",
                                  "D))",
                                  "()",
                                  "((  ))",
                                  "(((A + B)))",
                                  "((A * B))",
                                  "(A / B)",
                                  "A * B",
                                  "A / B + C",
                                  "A ^ (B - C) ",
                                  "(((C ^ E)))",
                                  "D",
                                  "( A - B * C)",
                                  "A- B / C",
                                  "( A / B * C)",
                                  "( A - C ^ C)",
                                  "( A * C ^ C) ",
                                  "( D / C ^ C)",
                                  "A - C ^ C ",
                                  "A - B * C +D / E",
                                  "A*B - C ^ C ^ D",
                                  "A B - C ^ C ^ D",
                                  "(( A - B * C) ^ D ^ E) ^ ( F / G * H + I )",
                                  "(A - B) * (( C * D ) + E)",
                                  "(((  )((  ) )((((  ))))",
                                  "(((  )((  ) ((((  ))))",
                                  "A * ( B / C) + D( A - B)",
                                  "A * ( B / C) + D ^ ( A - B)",
                                  "A * ( B / C) + D ^ A - B"};

        // Set output stream.
        System.setOut(fileStream);

        // Iterate through the above array, testing and converting all infix
        // expressions.
        for (String s : infixArray) {
            PostfixAndInfix expression = new PostfixAndInfix(s);

            // If it's not possible to convert the infix expression to a postfix
            // expression...
            if (! expression.infixConversion()) { continue; }

            expression.postfixEvaluation();
            System.out.println(expression.getInfixExpression() + " --> "
                               + expression.getPostfixExpression() + " --> "
                               + expression.getPostfixValue());
        }
    }
}
