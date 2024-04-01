package org.example.algorithms.easy;

import java.util.Arrays;

public class Problem_1480 {

    private static final int[] nums = {1, 2, 3, 4};

    public static void main(String[] args) {
        int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

}
