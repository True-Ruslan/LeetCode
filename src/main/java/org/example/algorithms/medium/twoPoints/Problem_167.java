package org.example.algorithms.medium.twoPoints;

/**
 * 167. Две суммы II — входной массив отсортирован
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */

public class Problem_167 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target){
            if (numbers[left] + numbers[right] < target){
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            }
        }

        int[] res = new int[2];
        res[0] = left + 1;
        res[1] = right + 1;

        return res;
    }

}
