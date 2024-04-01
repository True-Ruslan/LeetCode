package org.example.algorithms.easy;

/*
876. Середина связанного списка.

Учитывая head односвязный список, верните средний узел связанного списка .

Если есть два средних узла, верните второй средний узел.

Пример 1:
Ввод: head = [1,2,3,4,5]
 Выход: [3,4,5]
 Объяснение: Средний узел списка — это узел 3.

Пример 2:
Входные данные: head = [1,2,3,4,5,6]
 Выходные данные: [4,5,6]
 Объяснение: поскольку в списке есть два средних узла со значениями 3 и 4, мы возвращаем второй.
 */

import java.util.ArrayList;
import java.util.List;

public class Problem_876 {

    private static final ListNode LIST_NODE;

    static {
        ListNode fiveElement = new ListNode(5);
        ListNode fourthElement = new ListNode(4, fiveElement);
        ListNode thirdElement = new ListNode(3, fourthElement);
        ListNode secondElement = new ListNode(2, thirdElement);
        LIST_NODE = new ListNode(1, secondElement);
    }

    public static void main(String[] args) {
        ListNode listNode = middleNode(LIST_NODE);
        String result = result(listNode);

        System.out.println(result);
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

    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode middleNode2(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();

        int length = 0;
        while (head != null){
            listNodes.add(head);
            head = head.next;
            length++;
        }

        return listNodes.get(length / 2);
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
