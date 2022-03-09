package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class UnsortedArrayContainsSum {

    public static void main(String... args) {
        int[] arr = {9, 5, 3, 10, 8, 7, 4, 2, 1, 6, 0};
        int sum = 8;

        HashSet<List<Integer>> res = new HashSet<>();
        Hashtable<Integer, Integer> complement = new Hashtable<>();

        for (int count = 0; count < arr.length; count++) {
            if (complement.contains(sum - arr[count])) {
                res.add(Arrays.asList(arr[count], sum - arr[count]));
            }
            complement.put(sum - arr[count], arr[count]);
        }

        System.out.println(res);
    }

}
