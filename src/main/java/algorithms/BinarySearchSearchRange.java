package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchSearchRange {

    public static void main(String[] args) {
        int target = 1;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11));

        int start = new BinarySearchSearchRange().searchRange(arr, target, true);
        int end = new BinarySearchSearchRange().searchRange(arr, target, false);
        System.out.println(start + " " + end);
    }

    public int searchRange(final List<Integer> A, int B, boolean isStart) {
        int left = 0;
        int right = A.size();
        int res = -1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get(mid) == B) {
                res = mid;
                if (isStart)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (B < A.get(mid))
                right = mid - 1;
            else if (A.get(mid) < B)
                left = mid + 1;
        }
        return res;
    }

}
