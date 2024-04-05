package org.example.algorithms.easy;

/*

    Напишите функцию для поиска самой длинной строки общего префикса среди массива строк.
    Если общего префикса нет, верните пустую строку "".

    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

 */

import java.util.Arrays;

public class Problem_14 {

    public static void main(String[] args) {

        String[] str = {"flower", "flow", "flight"};

        String s = longestCommonPrefix(str);

        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder substring = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return substring.toString();
            }
            substring.append(first.charAt(i));
        }

        return substring.toString();
    }

}
