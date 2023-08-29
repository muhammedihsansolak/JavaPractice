package linkedListPractice;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String val;
    Node next;

    public Node(String val) {
        this.val = val;
    }
    //************* TRAVERSAL

    //print with iteration
    public static void printIteration(Node head){
        Node current = head;

        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    //print with recursion
    public static void printRecursive(Node head){
        //base case
        if (head == null) return;
        System.out.println(head.val);
        printRecursive(head.next);
    }

    //************* BRING ALL VALUES

    public static List<String> iterativeValues(Node head){
        List<String> result = new ArrayList<>();

        while (head != null){
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    }

}
