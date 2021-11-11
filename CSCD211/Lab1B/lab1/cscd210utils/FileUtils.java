package lab1.cscd210utils;

import java.io.*;
import java.util.Scanner;

/**
 * Basic FileUtil class that will be used throughout the quarter.
 *
 * @NOTE All passed parameters are always final!
 */
public class FileUtils {
    private FileUtils() { }

    /**
     * The countRecords method counts the number of lines in the file and returns the
     * count divided by the number of lines per record.
     *
     * @param fin      The Scanner object representing the file.
     * @param linesPer The number of lines per each record.
     * @return int     Representing the number of records in the file.
     *
     * @throws IllegalArgumentException If the Scanner object is null.
     * @throws IllegalArgumentException If the lines per record is <= 0.
     * @throws RuntimeException         If the count of lines is 0.
     */
    public static int countRecords(final Scanner fin, final int linesPer) {
        if (fin == null) {
            throw new IllegalArgumentException("Scanner can't be null");
        }
        if (linesPer <= 0) {
            throw new IllegalArgumentException(
                    "Parameter can't be less than or equal to 0");
        }

        int count = 0;

        while (fin.hasNext()) {
            fin.nextLine();
            count++;
        }

        if (count == 0) { throw new RuntimeException("Count is 0"); }

        return count / linesPer;
    }

    /**
     * The openInputFile method prompts the user for a filename, attempts to open that
     * filename, if successful a File object containing information on the file is
     * returned.
     *
     * @param kb    The Scanner object representing the keyboard.
     * @return File Representing an object to the open file.
     *
     * @throws IllegalArgumentException If the Scanner object is null.
     */
    public static File openInputFile(final Scanner kb) {
        if (kb == null) { throw new IllegalArgumentException("Scanner can't be null"); }

        String fn  = null;
        File   fin = null;

        do {
            System.out.print("Please enter the name of the file ");
            fn = kb.nextLine();

            fin = new File(fn);

            if (! fin.exists()) { System.out.println("The file does not exist"); }
        } while (! fin.exists());

        return fin;
    }

    /**
     * The openInputFile method receives a filename, attempts to open that filename, if
     * successful a File object containing information on the file is returned.
     *
     * @param filename The String representing the filename.
     * @return File    Representing an object to the open file.
     *
     * @throws IllegalArgumentException If the String object is null.
     * @throws IllegalArgumentException If the String is empty.
     * @throws RuntimeException         If the file could not be opened.
     */

    public static File openInputFile(final String filename) {
        if (filename == null) {
            throw new IllegalArgumentException("filename is null");
        }

        if (filename.isEmpty()) {
            throw new IllegalArgumentException("filename is empty");
        }

        File inf = new File(filename);
        if (inf.exists()) { return inf; }

        throw new RuntimeException("File could not be opened");
    }
}
