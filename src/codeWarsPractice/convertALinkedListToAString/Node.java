package codeWarsPractice.convertALinkedListToAString;

class Node {
    private int data;
    private Node next;
    
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public static String stringify(Node list) {
        String result ="";
        while (list != null){
            result += list.getData() + " -> ";
            list = list.getNext();
        }
        result += "null";
        return result;
    }


}