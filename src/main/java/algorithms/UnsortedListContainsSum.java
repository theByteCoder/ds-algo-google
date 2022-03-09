package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class UnsortedListContainsSum {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(4, 6, 2, -1, 3, 9, 1, 6, 10, 5, 7, 8, 10));
        int sum = 8;

        HashSet<List<Integer>> res = isSumFoundInList(l, sum);
        System.out.println(res);
    }

    public static HashSet<List<Integer>> isSumFoundInList(List<Integer> l, int sum) {
        HashSet<List<Integer>> res = new HashSet<>();

        Hashtable<Integer,Integer> complementList = new Hashtable<>();
        for(int count = 0; count < l.size(); count++) {
            if(complementList.contains(sum - l.get(count))) {
                res.add(new ArrayList<>(Arrays.asList(l.get(count), sum - l.get(count))));
            }
            complementList.put(sum - l.get(count), l.get(count));
        }
        return res;
    }
}
