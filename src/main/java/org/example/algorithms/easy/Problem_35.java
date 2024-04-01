package org.example.algorithms.easy;

/*
Учитывая отсортированный массив различных целых чисел и целевое значение, верните индекс, если цель найдена. Если нет, верните индекс там, где он был бы, если бы он был вставлен по порядку.

Вы должны написать алгоритм со  O(log n)сложностью выполнения.

Пример 1:
Ввод: nums = [1,3,5,6], цель = 5
 Вывод: 2

Пример 2:
Ввод: nums = [1,3,5,6], цель = 2
 Вывод: 1

Пример 3:
Ввод: nums = [1,3,5,6], цель = 7
 Вывод: 4
 */

public class Problem_35 {

    private static final int[] NUMS = {1, 2, 4, 5};
    private static final int TARGET = 6;

    public static void main(String[] args) {
        int i = searchInsert(NUMS, TARGET);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;
    }

}
