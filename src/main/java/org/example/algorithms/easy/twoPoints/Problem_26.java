package org.example.algorithms.easy.twoPoints;

/**
 * 26. Удалите дубликаты из отсортированного массива
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

public class Problem_26 {
    public static void main(String[] args) {
        Problem_26 problem26 = new Problem_26();
        int i = problem26.removeDuplicates(new int[]{1, 2});
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == nums[fast]) {
                continue;
            } else if (fast - slow > 1) {
                nums[slow + 1] = nums[fast];
                slow++;
            } else if (fast - slow == 1 && nums[slow] != nums[fast]){
                slow++;
            }
        }

        return slow + 1;
    }

    public int removeDuplicates2(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
