package org.example.algorithms.easy;

/*
Учитывая массив целых чисел arr, возврат true , если количество вхождений каждого значения в массиве уникально или false нет .

Пример 1:
Ввод: arr = [1,2,2,1,1,3]
 Выход: true
 Объяснение:  Значение 1 встречается 3 раза, 2 — 2 и 3 — 1. Никакие два значения не встречаются одинаково.

Пример 2:
Ввод: arr = [1,2]
 Вывод: ложь

 Пример 3:
Ввод: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 Выход: true
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem_1207 {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        boolean b = uniqueOccurrences(arr);
        System.out.println(b);
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> uniqueOccurrencesMap = new HashMap<>();
        for (int key : arr) {
            Integer valueOrDefault = uniqueOccurrencesMap.getOrDefault(key, 0);
            uniqueOccurrencesMap.put(key, valueOrDefault + 1);
        }

        Set<Integer> uniqueOccurrencesSet = new HashSet<>(uniqueOccurrencesMap.values());

        return uniqueOccurrencesMap.size() == uniqueOccurrencesSet.size();
    }

}
