package org.example.algorithms.medium.slidingWindow;

/**
 * 209. Сумма подмассива минимального размера
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */

public class Problem_209 {
    private static final int target = 7;
    private static final int[] nums = {2, 3, 1, 2, 4, 3};

    public static void main(String[] args) {
        Problem_209 problem209 = new Problem_209();
        int i = problem209.minSubArrayLen(target, nums);

        System.out.println(i);
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, minLength = Integer.MAX_VALUE, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (target <= sum) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
