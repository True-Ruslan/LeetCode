package org.example.algorithms.easy.twoPoints;

/**
 * 344. Обратная строка
 * https://leetcode.com/problems/reverse-string
 */

public class Problem_344 {
    public static void main(String[] args) {
        Problem_344 cl = new Problem_344();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        cl.reverseString(s);

        System.out.println(s);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
