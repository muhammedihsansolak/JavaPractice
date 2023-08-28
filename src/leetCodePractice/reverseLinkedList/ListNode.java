package leetCodePractice.reverseLinkedList;

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

    /**
     * In order to reverse linkedList we need to change the pointers of each object. If we change the pointer without save the data anywhere, we lost it. For this reason, we need to keep track 3 pointers. prev, current and nxt. Before changing any pointer we need to back up our data, then we change.
     *
     */

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null){
            ListNode nxt = current.next; //for storing the next node before changing the pointer. in order to not lost data
            current.next = prev;//changing the pointer
            prev = current;//going forward
            current = nxt;//going forward
        }
        return prev;
    }
}
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */