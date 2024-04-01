package org.example.algorithms.easy;

/*
Вам дана m x n целочисленная сетка, accounts в которой accounts[i][j]указана сумма денег, которую клиент имеет в банке.
Верните богатство , которое есть у самого богатого клиента.

Богатство клиента — это сумма денег, которая находится на всех его банковских счетах.
Самый богатый клиент – это клиент, обладающий максимальным богатством .

 Пример 1:

Входные данные: account = [[1,2,3],[3,2,1]]
 Выходные данные: 6
 Объяснение :
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
 Оба клиента считаются самыми богатыми с богатством 6 каждый, поэтому верните 6.
Пример 2:

Ввод: счета = [[1,5],[7,3],[3,5]]
 Вывод: 10
 Объяснение :
У 1-го клиента богатство = 6
У 2-го клиента богатство = 10
У третьего клиента богатство = 8
Второй клиент — самый богатый, его богатство равно 10.
Пример 3:

Ввод: счета = [[2,8,7],[7,1,3],[1,9,5]]
 Вывод: 17
*/

public class Problem_1672 {

    private static final int[][] account = {
            {2, 2, 3},
            {3, 2, 5}
    };

    public static void main(String[] args) {
        int i = maximumWealth(account);
        System.out.println(i);
    }

    private static int maximumWealth(int[][] accounts) {
        int rich = 0;
        for (int[] ints : accounts) {
            int[] result = new int[ints.length];
            result[0] = ints[0];
            for (int j = 1; j < ints.length; j++) {
                result[j] = result[j - 1] + ints[j];
            }
            if (result[ints.length - 1] > rich) {
                rich = result[ints.length - 1];
            }
        }

        return rich;
    }

    private static int maximumWealth2(int[][] accounts) {
        int rich = 0;
        for (int[] ints : accounts) {
            int temp = 0;
            for (int anInt : ints) {
                temp += anInt;
            }
            rich = Math.max(rich, temp);
        }

        return rich;
    }

}

