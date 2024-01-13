package pro.sky.javacoursepart2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(15, 0, -17, 2, 100, -178, -555, 37, 42, 99));
//        list.sort(Comparator.naturalOrder());
        selectionSort(list);

        System.out.println(list); // [-555, -178, -17, 0, 2, 15, 37, 42, 99, 100]
        System.out.println(binary_search(list, 0));
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