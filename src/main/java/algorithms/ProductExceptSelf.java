package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("res " + Arrays.toString(productExceptSelf(nums)));

        nums = new int[]{-1, 1, 0, -3, 3};
        System.out.println("res " + Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length, product = 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int e = nums[i];
            res[i] = product;
            product *= e;
        }

        product = 1;
        for (int i = len - 1; i >= 0; i--) {
            int e = nums[i];
            res[i] *= product;
            product *= e;
        }
        return res;
    }
}
