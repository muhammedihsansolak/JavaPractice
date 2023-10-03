package leetCodePractice.palindromeLinkedList;

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

    public boolean isPalindrome(ListNode head) {
        String result = "";
        while (head != null) {
            result += head.val;
            head = head.next;
        }
        return new StringBuilder(result).reverse().toString().equals(result);
    }


    public boolean isPalindrome2(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


}
