public class Sorter {
    public static void insertionSort(int[] arr) {

        int l = arr.length;

        for (int i = 1; i < l; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;

        }
    }
    public static void sort(int[] array) {

        insertionSort(array); // calling the function inside sort function.
    }

}
