package org.example.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/*
Вам даны заголовки двух отсортированных связанных списков list1 и list2.

Объедините два списка в один отсортированный список. Список должен быть составлен путем сращивания узлов первых двух списков.

Возвращает заголовок объединенного связанного списка .

Пример 1:
Ввод: список1 = [1,2,4], список2 = [1,3,4]
 Выход: [1,1,2,3,4,4]

Пример 2:
Ввод: список1 = [], список2 = []
 Вывод: []

Пример 3:
Ввод: список1 = [], список2 = [0]
 Выход: [0]
 */

public class Problem_21 {

    private static final ListNode FIRST_LIST_NODE;
    private static final ListNode SECOND_LIST_NODE;

    static {
        ListNode fiveElement = new ListNode(5);
        ListNode fourthElement = new ListNode(4, fiveElement);
        ListNode thirdElement = new ListNode(3, fourthElement);
        ListNode secondElement = new ListNode(2, thirdElement);
        FIRST_LIST_NODE = new ListNode(1, secondElement);
    }

    static {
        ListNode fiveElement = new ListNode(9);
        ListNode fourthElement = new ListNode(6, fiveElement);
        ListNode thirdElement = new ListNode(3, fourthElement);
        ListNode secondElement = new ListNode(2, thirdElement);
        SECOND_LIST_NODE = new ListNode(1, secondElement);
    }

    public static void main(String[] args) {
        ListNode listNode = mergeTwoLists(FIRST_LIST_NODE, SECOND_LIST_NODE);
        String result = result(listNode);
        System.out.println(result);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null)
            return list2;
        return list1;
    }

    private static String result(ListNode head) {
        List<Integer> res = new ArrayList<>();
        res.addFirst(head.val);

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;

            res.add(slow.val);
        }

        return res.toString();
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
