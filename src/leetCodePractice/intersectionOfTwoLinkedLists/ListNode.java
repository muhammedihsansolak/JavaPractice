package leetCodePractice.intersectionOfTwoLinkedLists;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }


    /**
     * I iterated first list (headA) with while loop and used a HashSet data structure to store nodes from the first list (headA).
     * Another while loop iterates through the nodes of headB. For each node, it checks if the node is already in the hashSet (i.e., if it has been encountered in the first list). If it finds a node in the HashSet, it means an intersection point is found, and the function returns the intersecting node.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hashSet = new HashSet<>();
        ListNode current = headA;
        while (current != null) {
            hashSet.add(current);
            current = current.next;
        }
        current = headB;
        while (current != null) {
            if (hashSet.contains(current)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }



    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        ListNode currentA = headA;
        ListNode currentB = headB;

        int sizeOfA = sizeOfList(headA);
        int sizeOfB = sizeOfList(headB);
        //iterate longer list ahead
        if (sizeOfA > sizeOfB) {
            for (int i = 0; i < sizeOfA - sizeOfB; i++) {
                currentA = currentA.next;
            }
        } else {
            for (int i = 0; i < sizeOfB - sizeOfA ; i++) {
                currentB = currentB.next;
            }
        }

        while (currentA != null && currentB != null){
            if (currentA.equals(currentB)) return currentA;
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return null;
    }

    private int sizeOfList(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        return size;
    }

}
/*
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.
 */

