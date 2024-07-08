package pro.sky.javacoursepart2;

import pro.sky.javacoursepart2.quicksort.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(15, 0, -17, 2, 100, -178, -555, 37, 42, 99));
        System.out.println("initial list");
        System.out.println(list);

        System.out.println("list sorted by selection sort");
        selectionSort(list);
        System.out.println(list + "\n");

        System.out.println("find index of \"0\" in sorted list using binary search");
        System.out.println(binary_search(list, 0) + "\n");

        int[] array = {0, 1, 10, 4, 3, 7, 5, 6, 4, 8, 7, 9, 10, 0, 2, 4, 4, 4};
        System.out.println("initial array");
        System.out.println(Arrays.toString(array));

        System.out.println("array sorted by quick sort");
        QuickSort.quicksort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int binary_search(List<Integer> sortedList, int item) {
        int low, high, mid;
        low = 0;
        high = sortedList.size() - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (sortedList.get(mid) == item) return mid;
            if (item < sortedList.get(mid)) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return -1;
    }

    public static void selectionSort(List<Integer> list) {
        int temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }


}