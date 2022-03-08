package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchBinary {

    public static void main(String[] args) {
        int target = 7;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        int res = new SearchBinary().binarySearch(arr, target);
        System.out.println(res);
    }

    public Integer binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        // for odd list size
        if (arr.size() % 2 != 0 && arr.get(right).equals(target)) return right;
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
