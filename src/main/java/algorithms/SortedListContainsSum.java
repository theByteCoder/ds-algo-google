package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SortedListContainsSum {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10));
        int sum = 8;

        HashSet<List<Integer>> res = isSumFoundInList(l, sum);
        System.out.println(res);
    }

    public static HashSet<List<Integer>> isSumFoundInList(List<Integer> l, int sum) {
        int low = 0;
        int high = l.size() - 1;
        HashSet<List<Integer>> res = new HashSet<>();
        while (low < high) {
            if (l.get(low) + l.get(high) == sum) {
                res.add(new ArrayList<>(Arrays.asList(l.get(low), l.get(high))));
                low += 1;
            } else if (l.get(low) + l.get(high) > sum) {
                high -= 1;
            } else if (l.get(low) + l.get(high) < sum) {
                low += 1;
            }
        }
        return res;
    }

}
