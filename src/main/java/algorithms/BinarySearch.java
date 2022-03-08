package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int target = 7;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        int res = new BinarySearch().binarySearch(arr, target);
        System.out.println(res);
    }

    public Integer binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();

        // for odd list size
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr.get(mid).equals(target)) {
                return mid;
            } else if (arr.get(mid) > target) {
                right = mid - 1;
            } else if (arr.get(mid) < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

}
