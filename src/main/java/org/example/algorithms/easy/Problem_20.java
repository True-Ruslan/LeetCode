package org.example.algorithms.easy;

/*
    Учитывая строку s, содержащую только символы '(', ')', '{', и '}', определите, является ли входная строка допустимой.'['']'

    Входная строка действительна, если:

    Открытые скобки должны закрываться скобками того же типа.
    Открытые скобки должны закрываться в правильном порядке.
    Каждой закрывающей скобке соответствует открытая скобка того же типа.

    Пример 1:
    Ввод: s = "()"
    Вывод: true

    Пример 2:
    Ввод: s = "()[]{}"
    Вывод: true

    Пример 3:
    Ввод: s = "(]"
    Вывод: ложь
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Problem_20 {

    public static void main(String[] args) {

        boolean valid = isValid2("(()[])");
        System.out.println(valid);

    }

    private static boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>(); // создаем пустой стек
        for (char c : s.toCharArray()) { // итерируемся по каждому элементу строки
            if (c == '(') // если символ является открывающей скобкой
                stack.push(')'); // поместите соответствующую закрывающую скобку в стек
            else if (c == '{') // если символ является открывающей скобкой
                stack.push('}'); // поместите соответствующую закрывающую скобку в стек
            else if (c == '[') // если символ является открывающей скобкой
                stack.push(']'); // поместите соответствующую закрывающую скобку в стек
            else if (stack.isEmpty() || stack.pop() != c) // если символ является закрывающей скобкой
                // если стек пуст (т. е. нет соответствующей открывающей скобки) или вершина стека
                // не соответствует закрывающей скобке, строка недействительна, поэтому верните false
                return false;
        }
        // если стек пуст, все открывающие скобки сопоставлены с соответствующими закрывающими скобками,
        // поэтому строка действительна, в противном случае имеются несовпадающие открывающие скобки, поэтому верните false
        return stack.isEmpty();
    }

    // Не работает. Попытки решить "в лоб"
    private static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) {
            return false;
        }

        List<Character> closedBracket = List.of('(', '{', '[');
        List<Character> openBracket = List.of(')', '}', ']');
        if (closedBracket.contains(charArray[charArray.length - 1]) || openBracket.contains(charArray[0])) {
            return false;
        }

        int result = 0;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] == '(' && charArray[i + 1] == ')' || charArray[i] == '(' && charArray[charArray.length - 1 - i] == ')')
                result++;
            else if (charArray[i] == '[' && charArray[i + 1] == ']' || charArray[i] == '[' && charArray[charArray.length - 1 - i] == ']')
                result++;
            else if (charArray[i] == '{' && charArray[i + 1] == '}' || charArray[i] == '{' && charArray[charArray.length - 1 - i] == '}')
                result++;
        }

        return result == charArray.length / 2;
    }

}
