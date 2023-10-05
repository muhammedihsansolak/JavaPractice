package leetCodePractice.addTwoNumbers;

import java.util.Deque;
import java.util.LinkedList;

public class ListNode {
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

    //not works properly --> 32 / 1568 testcases passed
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String num1 = "", num2 = "";
        Deque<Integer> stack = new LinkedList<>();
        ListNode current = l1;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            num1 += stack.pop();
        }
        current = l2;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            num2 += stack.pop();
        }

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        StringBuilder str = new StringBuilder(sum + "");
        str = str.reverse();

        ListNode tempHead = new ListNode();
        current = tempHead;
        for (int i = 0; i < str.length(); i++) {
            ListNode listNode = new ListNode(Integer.parseInt(str.charAt(i) + ""));
            current.next = listNode;
            current = listNode;
        }
        return tempHead.next;
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode newHead = new ListNode(0);
        ListNode current = newHead;
        int remainder = 0;

        while (l1 != null || l2 != null || remainder != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + remainder;
            int digit = sum % 10;
            remainder = sum / 10;

            ListNode newNode = new ListNode(digit);
            current.next = newNode;
            current = newNode;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = newHead.next;
        newHead.next = null;
        return result;
    }


    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {

        ListNode newHead = new ListNode();
        ListNode current = newHead;
        int remain = 0;

        while (l1 != null || l2 != null || remain != 0){

            int digit1 =  (l1 != null) ? l1.val : 0;
            int digit2 =  (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + remain;
            int digit = sum % 10;
            remain = sum / 10;

            ListNode listNode = new ListNode(digit);
            current.next = listNode;
            current = listNode;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        current = newHead.next;
        newHead.next = null;
        return current;
    }



}
