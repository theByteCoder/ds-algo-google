package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SearchHalfLinear {

    public static void main(String[] args) {
        int target = 7;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Function<List<Integer>, Integer> halfLinearSearh = list -> {
            int size = list.size();
            int mid = size / 2;
            for (int count = 0; count < mid; count++) {
                int midStartCount = mid + count;
                if (list.get(count).equals(target)) {
                    return count;
                } else if (list.get(midStartCount).equals(target)) {
                    return midStartCount;
                } else if (size % 2 != 0 && list.get(size - 1).equals(target)) {
                    return size - 1;
                }
            }
            return -1;
        };

        int res = halfLinearSearh.apply(arr);
        System.out.println(res);
    }

}
