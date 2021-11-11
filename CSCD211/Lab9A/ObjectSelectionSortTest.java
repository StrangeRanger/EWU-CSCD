/** This program tests the selectionSort method in the ObjectSelectionSorter class. */
public class ObjectSelectionSortTest {
    public static void main(String[] args) {
        // Create a String array with test values.
        String[] people = {"David", "Abe", "Katherine", "Beth", "Jeff", "Daisy"};

        // Display the array's contents.
        System.out.println("Original order: ");
        for (String element: people) { System.out.print(element + " "); }
        System.out.println();

        // Sort the array.
        ObjectSelectionSorter.selectionSort(people);

        // Display the array's contents.
        System.out.println("\nSorted order: ");
        for (String element: people) { System.out.print(element + " "); }
        System.out.println();
    }
}