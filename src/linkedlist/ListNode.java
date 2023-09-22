package linkedlist;

public class ListNode {

    int val;
    ListNode next;
    ListNode head;
    ListNode tail;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public ListNode findNthElement(int n, ListNode head){

        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n-1; i++) {
            second = second.next;
        }

        while (second.next != null){
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public int indexOf(int val, ListNode head){

        ListNode current = head;
        int counter = 0;
        while (current != null){
            if (current.val == val) return counter;
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void deleteLast(ListNode head ){

        ListNode first = head;
        ListNode second = head.next;

        while (second != null){
            first = first.next;
            second = second.next;
        }

        first.next = null;
        tail = first;

    }

}
