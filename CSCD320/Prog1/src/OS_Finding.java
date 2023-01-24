import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OS_Finding {
    public static void main(String[] args) throws IOException {
        OS_Finding OSFinding = new OS_Finding();
        int[] array          = OSFinding.fileReader(args[0]);

        System.out.println(OSFinding.randomizedSelect(array, 0, array.length - 1,
                                                      Integer.parseInt(args[1])));
    }

    public int[] fileReader(String fileName) throws FileNotFoundException {
        Scanner            scanner   = new Scanner(new FileReader(fileName));
        ArrayList<Integer> arrayList = new ArrayList<>();
        int                integer;

        while (scanner.hasNextLine()) {
            integer = scanner.nextInt();
            arrayList.add(integer);
        }

        int[] array = new int[arrayList.toArray().length];

        for (int i = 0; i < arrayList.toArray().length; i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }

    public void swap(int[] A, int left, int right) {
        int tmp  = A[right];
        A[right] = A[left];
        A[left]  = tmp;
    }

    /**
     * Partition A[left...right] using A[right] as the pivot.
     * Return: the index of the array location that saves the pivot after partition.
     */
    public int partition(int[] A, int left, int right) {
        int pivot = A[right];
        int index = left;

        for (int i = left; i != right; i++) {
            if (A[i] <= pivot) {
                swap(A, index, i);
                index++;
            }
        }

        swap(A, index, right);
        return index;
    }

    /**
     * Partition A[left..right] using a randomly picked element from A[left..right] as the pivot.
     * @return The index of the array location that saves the pivot after partition.
     */
    public int randomizedPartition(int[] A, int left, int right) {
        // A number randomly picked from the range [left..right].
        Random random = new Random();
        int    i      = random.nextInt(left, right);

        swap(A, i, right);

        return partition(A, left, right);
    }

    /**
     * ...
     */
    public int randomizedSelect(int[] A, int left, int right, int i) {
        if (left == right) { return A[left]; }

        // A[q] is the pivot after partition.
        int partition = randomizedPartition(A, left, right);
        int k         = partition - left + 1;

        if (i == k) {
            return A[partition];
        } else if (i < k) {
            return randomizedSelect(A, left, partition - 1, i);
        } else {
            return randomizedSelect(A, partition + 1, right, i - k);
        }
    }
}