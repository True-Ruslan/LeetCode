package org.example.algorithms.medium.slidingWindow;

import java.util.Arrays;

/**
 * 567. Перестановка в строке
 * <a href="https://leetcode.com/problems/permutation-in-string/description/">567. Перестановка в строке</a>
 */

public class Problem_567 {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Sorted = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            s1Sorted[i] = s1.charAt(i);
        }
        Arrays.sort(s1Sorted);

        int window = s1.length();
        for (int i = 0; i <= s2.length() - window; i++) {
            char[] sub = new char[window];
            for (int j = 0; j < window; j++) {
                sub[j] = s2.charAt(i + j);
            }
            Arrays.sort(sub);

            boolean equal = true;
            for (int j = 0; j < window; j++) {
                if (s1Sorted[j] != sub[j]) {
                    equal = false;
                    break;
                }
            }
            if (equal)
                return true;
        }
        return false;
    }
}
