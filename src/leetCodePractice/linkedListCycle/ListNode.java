package leetCodePractice.linkedListCycle;

import java.util.*;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    /**
     *We can use two pointer. fast & slow runners. slow runs 1 element, fast runs 2 element in each iteration. If they meet up it means we have a cycle
     */
    public boolean hasCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
        // Move slow pointer by 1 node and fast at 2 at each step.
            slow =slow.next;
            fast = fast.next.next;
        // If both the pointers meet at any point, then the cycle is present and return true...
            if (slow == fast) return true;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            if (!set.add(current)) return true;
            current = current.next;
        }
        return false;
    }

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */
}
