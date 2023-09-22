package leetCodePractice.removeDuplicatesFromLinkedList;

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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode current = head;


        while (current != null) {
            if (current.next == null) break;
            if (current.val != current.next.val){
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
        return result;
    }

}
