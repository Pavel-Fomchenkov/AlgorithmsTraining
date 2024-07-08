package pro.sky.javacoursepart2.quicksort;

public class QuickSort {
    public static void quicksort(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        partition(arr, startIndex, endIndex);
    }

    private static void partition(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivot = arr[endIndex];
        int index = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] <= pivot) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, endIndex);

        partition(arr, startIndex, index - 1);
        partition(arr, index + 1, endIndex);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
