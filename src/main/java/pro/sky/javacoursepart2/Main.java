package pro.sky.javacoursepart2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(15, 0, -17, 2, 100, -178, -555, 37, 42, 99));
        list.sort(Comparator.naturalOrder());
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


}