public class Sorter {

    public static void selectionSort(int[] array) {

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            System.out.println(array[i]);
        }
    }

    public static void sort2(int[] array) {

        selectionSort(array); // calling the function inside sort function.
    }

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

    public static void main(String[] args) {

        int[] array = {19, 1, 44, 15, 31}; // general integer numbers

        sort(array); // calling the sort

        System.out.print("Sorted array is using insertion sort: ");
        for (int i = 0; i < array.length; ++i)
            System.out.print(" " + array[i]);
        System.out.println();



        System.out.print("\nSorted array is using selection sort:\n ");
        int[] array2 = {5,23,1,7,4,7,9};
        sort2(array2);

    }

}
