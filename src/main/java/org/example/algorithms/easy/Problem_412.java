package org.example.algorithms.easy;

/*
412. Физз Базз

Учитывая целое число n, верните массив строк answer( с индексом 1 ), где :

answer[i] == "FizzBuzz"если iделится на 3и 5.
answer[i] == "Fizz"если iделится на 3.
answer[i] == "Buzz"если iделится на 5.
answer[i] == i(как строку), если ни одно из вышеуказанных условий не верно.


Пример 1:

Вход: n = 3
 Выход: ["1","2","Fizz"]
Пример 2:

Вход: n = 5
 Выход: ["1","2","Fizz","4","Buzz"]
Пример 3:

Вход: n = 15
 Выход: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11 ","Fizz","13","14","FizzBuzz"]
 */

import java.util.ArrayList;
import java.util.List;

public class Problem_412 {

    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
        System.out.println(strings);
    }

    private static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            answer.add(i, String.valueOf(i + 1));
        }
        for (int i = 0; i < answer.size(); i++) {
            if (Integer.parseInt(answer.get(i)) % 3 == 0 && Integer.parseInt(answer.get(i)) % 5 == 0) {
                answer.set(i, "FizzBuzz");
            } else if (Integer.parseInt(answer.get(i)) % 3 == 0) {
                answer.set(i, "Fizz");
            } else if (Integer.parseInt(answer.get(i)) % 5 == 0) {
                answer.set(i, "Buzz");
            }
        }

        return answer;
    }

    private static List<String> fizzBuzz2(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }

        return ans;
    }

}
