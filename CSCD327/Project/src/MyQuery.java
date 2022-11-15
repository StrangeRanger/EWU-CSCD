// -------------------------------------------------------------------------------------
// Query the Crime Database
//
// By: Hunter T.
// -------------------------------------------------------------------------------------

import java.io.*;
import java.lang.String;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class MyQuery {
    private Connection conn      = null;
    private Statement  statement = null;
    private ResultSet  resultSet = null;

    public MyQuery(Connection c) throws SQLException {
        conn      = c;
        statement = conn.createStatement();
    }

    /* [ Query 0: this is a sample query provided by Dr. Li ] *********************** */

    public void findChargeDate() throws SQLException {
        String query = "SELECT crime_id, date_charged "
                     + "FROM crimes "
                     + "WHERE date_charged <= '2008-10-22';";

        resultSet = statement.executeQuery(query);
    }

    public void printChargeDate() throws IOException, SQLException {
        System.out.println("******** Query 0 ********");
        System.out.println("Crime_ID\t"
                           + "Charge_Date");

        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getString(2);
            int  crimeID    = resultSet.getInt(1);
            Date chargeDate = resultSet.getDate("date_charged");
            System.out.println(crimeID + "\t\t" + chargeDate);
        }
    }

    /* [ Query 1 ]******************************************************************* */

    public void findBestOfficer() throws SQLException {
        String query = "SELECT first, last, COUNT(crime_id) as 'cnt' "
                     + "FROM officers "
                     + "    JOIN crime_officers USING (officer_id) "
                     + "    JOIN crimes         USING (crime_id) "
                     + "GROUP BY officer_id "
                     + "HAVING cnt > ( "
                     + "    SELECT AVG(cnt) "
                     + "    FROM ( "
                     + "        SELECT COUNT(crime_id) as 'cnt' "
                     + "        FROM officers "
                     + "            JOIN crime_officers USING (officer_id) "
                     + "            JOIN crimes         USING (crime_id) "
                     + "        GROUP BY officer_id "
                     + "    ) AS tmp "
                     + ");";

        resultSet = statement.executeQuery(query);
    }

    public void printBestOfficer() throws IOException, SQLException {
        System.out.println("******** Query 1 ********");
        System.out.println("First\t"
                           + "Last\t"
                           + "cnt");

        while (resultSet.next()) {
            String first = resultSet.getString(1);
            String last  = resultSet.getString(2);
            int    cnt   = resultSet.getInt(3);
            System.out.println(first + "\t" + last + "\t" + cnt);
        }
    }

    /* [ Query 2 ]******************************************************************* */

    public void findCrimeCharge() throws SQLException {
        String query = "SELECT charge_id "
                     + "FROM crime_charges "
                     + "WHERE fine_amount > ( "
                     + "    SELECT AVG(fine_amount) "
                     + "    FROM crime_charges "
                     + ") AND amount_paid < ( "
                     + "    SELECT AVG(amount_paid) "
                     + "    FROM crime_charges "
                     + ");";

        resultSet = statement.executeQuery(query);
    }

    public void printCrimeCharge() throws IOException, SQLException {
        System.out.println("******** Query 2 ********");
        System.out.println("charge_id");

        while (resultSet.next()) {
            int chargeID = resultSet.getInt(1);
            System.out.println(chargeID);
        }
    }

    /* [ Query 3 ]******************************************************************* */

    public void findCriminal() throws SQLException {
        String query = "SELECT DISTINCT first, last "
                     + "FROM crime_charges "
                     + "    JOIN crimes USING (crime_id) "
                     + "    JOIN criminals USING (criminal_id) "
                     + "WHERE crime_code = ( "
                     + "    SELECT crime_code "
                     + "    FROM crime_charges "
                     + "        JOIN crimes USING (crime_id) "
                     + "        JOIN criminals USING (criminal_id) "
                     + "    WHERE crime_id = 10089 "
                     + ");";

        resultSet = statement.executeQuery(query);
    }

    public void printCriminal() throws IOException, SQLException {
        System.out.println("******** Query 3 ********");
        System.out.println("first\t"
                           + "last");

        while (resultSet.next()) {
            String first = resultSet.getString(1);
            String last  = resultSet.getString(2);

            if (first.length() <= 3) {
                System.out.println(first + "\t\t" + last);
            } else {
                System.out.println(first + "\t" + last);
            }
        }
    }

    /* [ Query 4 ]******************************************************************* */

    public void findCriminalSentence() throws SQLException {
        String query =
                "SELECT criminal_id, last, first, COUNT(criminal_id) AS 'cnt_sentence' "
                + "FROM criminals JOIN sentences USING (criminal_id) "
                + "GROUP BY criminal_id "
                + "HAVING COUNT(*) > 1;";

        resultSet = statement.executeQuery(query);
    }

    public void printCriminalSentence() throws IOException, SQLException {
        System.out.println("******** Query 4 ********");
        System.out.println("criminal_id\t\t"
                           + "last\t"
                           + "first\t"
                           + "cnt_sentence");

        while (resultSet.next()) {
            int    criminalID  = resultSet.getInt(1);
            String last        = resultSet.getString(2);
            String first       = resultSet.getString(3);
            int    cntSentence = resultSet.getInt(4);
            System.out.println(criminalID + "\t\t\t" + last + "\t" + first + "\t\t"
                               + cntSentence);
        }
    }

    /* [ Query 5 ]******************************************************************* */

    public void findChargeCount() throws SQLException {
        String query = "SELECT precinct, COUNT(charge_status = 'GL') AS 'charge_cnt' "
                     + "FROM crime_charges "
                     + "    JOIN crime_officers USING (crime_id) "
                     + "    JOIN officers       USING (officer_id) "
                     + "WHERE (charge_status = 'GL') != 0 "
                     + "GROUP BY precinct "
                     + "HAVING charge_cnt >= 7;";

        resultSet = statement.executeQuery(query);
    }

    public void printChargeCount() throws IOException, SQLException {
        System.out.println("******** Query 5 ********");
        System.out.println("precinct\t"
                           + "charge_cnt");

        while (resultSet.next()) {
            String precinct    = resultSet.getString(1);
            int    chargeCount = resultSet.getInt(2);
            System.out.println(precinct + "\t\t" + chargeCount);
        }
    }

    /* [ Query 6 ]******************************************************************* */

    public void findEarliestLatest() throws SQLException {
        String query = "SELECT criminal_id, first, last, "
                     + "    MIN(start_date) AS 'earliest_start_date', "
                     + "    MAX(end_date)   AS 'latest_end_date' "
                     + "FROM criminals JOIN sentences USING (criminal_id) "
                     + "GROUP BY criminal_id; ";

        resultSet = statement.executeQuery(query);
    }

    public void printEarliestLatest() throws IOException, SQLException {
        System.out.println("******** Query 6 ********");
        System.out.println("criminal_id\t\t"
                           + "first\t"
                           + "last\t\t"
                           + "earliest_start_date\t\t"
                           + "latest_end_date");

        while (resultSet.next()) {
            int    criminalID        = resultSet.getInt(1);
            String first             = resultSet.getString(2);
            String last              = resultSet.getString(3);
            Date   earliestStartDate = resultSet.getDate(4);
            Date   latestEndDate     = resultSet.getDate(5);

            if (first.length() <= 3) {
                System.out.print(criminalID + "\t\t\t" + first + "\t\t");
            } else {
                System.out.print(criminalID + "\t\t\t" + first + "\t");
            }

            if (last.length() <= 3) {
                System.out.println(last + "\t\t\t" + earliestStartDate + "\t\t\t\t"
                                   + latestEndDate);
            } else if (last.length() >= 9) {
                System.out.println(last + "\t" + earliestStartDate + "\t\t\t\t"
                                   + latestEndDate);
            } else {
                System.out.println(last + "\t\t" + earliestStartDate + "\t\t\t\t"
                                   + latestEndDate);
            }
        }
    }

    /* [ Query 7 ]******************************************************************* */

    public void findCrimeCounts() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        String  query;
        int     officerID;

        System.out.println("******** Query 7 ********");
        System.out.print("Please enter the officer_id for the query: ");

        officerID = userInput.nextInt();
        query     = "CALL getNumber(" + officerID + ");";
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int crimeCnt = resultSet.getInt(1);
            System.out.println("Officer " + officerID + " has reported " + crimeCnt
                               + " crimes.");
        }
    }
}

