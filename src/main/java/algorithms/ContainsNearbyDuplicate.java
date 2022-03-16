package algorithms;

import java.util.HashMap;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums, k));

        k = 1;
        nums = new int[]{1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums, k));

        k = 2;
        nums = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> itemIndexes = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (itemIndexes.get(nums[i]) != null) {
                int oldIndex = itemIndexes.get(nums[i]);
                if (Math.abs(oldIndex - i) <= k) {
                    return true;
                }
            }
            itemIndexes.put(nums[i], i);
        }
        return false;
    }
}
