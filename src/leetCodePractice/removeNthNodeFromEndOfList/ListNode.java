package leetCodePractice.removeNthNodeFromEndOfList;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //if there is no element remove null
        if (head == null) return null;
        //declare three pointer
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        ListNode pointer1Prev = head;
        //iterate pointer2 n times to have a gap between pointer1 and pointer2
        for (int i = 0; i < n ; i++) {
            pointer2 = pointer2.next;
        }
        //if pointer2 is null it means we need to remove head of the list
        if (pointer2 == null){
            head = head.next;
            return head;
        }
        //iterate through end of the list
        while (pointer2 != null){
            //in order to delete an element, we need to know previous one. This pointer shows the previous one
            pointer1Prev = pointer1;
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }
        //delete operation
        pointer1Prev.next = pointer1Prev.next.next;
        pointer1.next = null;
        return head;
    }

}
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */