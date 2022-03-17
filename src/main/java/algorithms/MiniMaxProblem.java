package algorithms;

import java.util.Arrays;

public class MiniMaxProblem {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 999999999};
        System.out.println(Arrays.toString(miniMaxProblem(nums)));

        nums = new int[]{2, 1, 999999999, 3, 4};
        System.out.println(Arrays.toString(miniMaxProblem(nums)));
    }

    public static Long[] miniMaxProblem(int[] nums) {
        long totalSum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            totalSum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        long miniMinSum = totalSum - max;
        long miniMaxSum = totalSum - min;
        return new Long[]{miniMinSum, miniMaxSum};
    }
}
