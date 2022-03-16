package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateNumbers {

    public static void main(String args[]) {
        int[] nums1 = {0, 4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(hasDuplicates(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(hasDuplicates(nums2));
    }

    public static boolean hasDuplicates(int nums[]) {
        HashSet<Integer> uniques = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (uniques.contains(element)) {
                duplicates.add(element);
            } else {
                uniques.add(element);
            }
        }
        if (duplicates.size() > 0) return true;
        else return false;
    }
}