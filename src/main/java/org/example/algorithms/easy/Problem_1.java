package org.example.algorithms.easy;

/*
Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы их сумма составляла target .
Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Пример 1:
Ввод: nums = [2,7,11,15], target = 9
 Выход: [0,1]
 Объяснение: поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].

Пример 2:
Ввод: nums = [3,2,4], цель = 6
 Вывод: [1,2]

Пример 3:
Ввод: nums = [3,3], цель = 6
 Вывод: [0,1]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_1 {

    private static final int[] NUMS = {2, 7, 11, 15};
    private static final int TARGET = 9;

    public static void main(String[] args) {
        int[] ints = twoSum(NUMS, TARGET);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (numsMap.containsKey(second) && numsMap.get(second) != i) {
                return new int[]{i, numsMap.get(second)};
            }
        }

        return new int[]{};
    }

}
