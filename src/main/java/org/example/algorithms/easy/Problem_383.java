package org.example.algorithms.easy;

/*
383. Записка о выкупе

Учитывая две строки ransomNote и magazine, верните true if, который ransomNote может быть создан с использованием букв from magazine и false иначе .

Каждую букву magazine можно использовать только один раз ransomNote.

Пример 1:
Ввод: ransomNote = "a", журнал = "b"
 Вывод: false

Пример 2:
Ввод: ransomNote = "aa", журнал = "ab"
 Вывод: false

Пример 3:
Ввод: ransomNote = "aa", журнал = "aab"
 Вывод: true
 */

import java.util.HashMap;
import java.util.Map;

public class Problem_383 {

    public static void main(String[] args) {
        boolean b = canConstruct("bbb", "abbabcq");
        System.out.println(b);
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        // Создайте HashMap для хранения количества символов.
        Map<Character, Integer> dictionary = new HashMap<>();

        // Перебирать символы в журнале
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            // Если символ отсутствует в HashMap, добавьте его со счетчиком 1.
            if (!dictionary.containsKey(c)) {
                dictionary.put(c, 1);
            } else {
                // Если символ уже присутствует, увеличьте его счетчик на 1.
                dictionary.put(c, dictionary.get(c) + 1);
            }
        }

        // Перебирать символы в записке о выкупе
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            // Если символ присутствует в HashMap и его счетчик больше 0,
            // уменьшить его счетчик на 1
            if (dictionary.containsKey(c) && dictionary.get(c) > 0) {
                dictionary.put(c, dictionary.get(c) - 1);
            } else {
                // Если символ отсутствует или его счетчик равен 0, верните false.
                return false;
            }
        }

        // Все символы в записке о выкупе были успешно обработаны,
        // так что записку о выкупе можно составить из журнала
        return true;
    }

}
