package org.example.algorithms.easy.twoPoints;

/**
 * 283. Переместите нули
 * https://leetcode.com/problems/move-zeroes/
 */

public class Problem_283 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
