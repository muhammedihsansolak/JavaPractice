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
        String result="";
        while (head != null){
            result+=head.val;
            head = head.next;
        }
        return new StringBuilder(result).reverse().toString().equals(result);
    }

}
