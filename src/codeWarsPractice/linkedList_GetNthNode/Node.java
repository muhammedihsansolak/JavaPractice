package codeWarsPractice.linkedList_GetNthNode;

public class Node {
    public int data;
    public Node next = null;


    public static int getNth(Node n, int index) throws Exception {
        if (n.next == null && index > 0) throw new Exception();
        if (index < 0) throw new Exception();
        int count = 0;
        Node current = n;

        while (current != null){
            if (count == index) return current.data;
            current = current.next;
            count++;
        }
        if (count<=index) throw new Exception();
      return 123;
    }

    public static int getNth2(Node n, int index) throws Exception{

        for(int i = 0; n != null; i++, n = n.next)
            if(i == index)
                return n.data;

        throw new IndexOutOfBoundsException();
    }

}
