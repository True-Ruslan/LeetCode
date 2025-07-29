package org.example.algorithms.easy;

/**
 * 125. Правильный палиндром
 * https://leetcode.com/problems/valid-palindrome/
 */

public class Problem_125 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        String onlyLetters = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = onlyLetters.length() - 1;

        while (left < right) {
            if (onlyLetters.charAt(left) != onlyLetters.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
