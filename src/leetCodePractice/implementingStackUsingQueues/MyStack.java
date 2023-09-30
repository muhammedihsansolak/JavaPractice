package leetCodePractice.implementingStackUsingQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {

    Deque<Integer> queue = new ArrayDeque<>();

    public MyStack() {
    }

    public void push(int x) {
        queue.addFirst(x);
    }

    public int pop() {
        return queue.removeFirst();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
