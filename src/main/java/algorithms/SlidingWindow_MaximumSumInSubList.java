package algorithms;

public class SlidingWindow_MaximumSumInSubList {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 2};
        System.out.println(maximumSumInSubList(nums, 2));
    }

    public static int maximumSumInSubList(int[] nums, int k) {
        int maxSum = 0;
        int currentWindowSum = 0;
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            currentWindowSum += nums[i];
        }
        maxSum = currentWindowSum;
        for (int i = k; i < length; i++) {
            currentWindowSum = currentWindowSum + nums[i] - nums[i - k];
            maxSum = Math.max(currentWindowSum, maxSum);
        }
        return maxSum;
    }
}
