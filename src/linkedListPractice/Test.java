package linkedListPractice;

public class Test {
    public static void main(String[] args) {

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");

        a.next = b;
        b.next = c;
        c.next = d;

        Node.printIteration(a);

        System.out.println("----------------");

        Node.printRecursive(a);

        System.out.println("----------------");

        System.out.println( Node.iterativeValues(a) );



    }
}
