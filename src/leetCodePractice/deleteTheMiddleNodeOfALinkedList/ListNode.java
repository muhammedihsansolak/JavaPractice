package leetCodePractice.deleteTheMiddleNodeOfALinkedList;

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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null){
            return null;
        }
        if (head.next.next == null){
            head.next = null;
            return head;
        }

        ListNode pointer1 = head;
        ListNode pointer1Prev = head;
        ListNode pointer2 = head;

        while (pointer2 != null && pointer2.next != null){
            pointer1Prev = pointer1;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }
        pointer1Prev.next = pointer1.next;
        pointer1.next = null;
        return head;
    }

    public ListNode deleteMiddle2(ListNode head) {
        if (head.next == null){
            return null;
        }
        if (head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        int size = 0;
        while (pointer2 != null){
            pointer2 = pointer2.next;
            size++;
        }
        for (int i = 0; i < (size/2)-1; i++) {
            pointer1 = pointer1.next;
        }
        pointer1.next = pointer1.next.next;
        return head;
    }

}
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */