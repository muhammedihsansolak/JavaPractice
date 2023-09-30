package cydeoAlgorithmTasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElementFromQueue {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        reverseKElements(queue,4);

        System.out.println(queue); //[40, 30, 20, 10, 50]

    }

    public static <T> Deque<T> reverseKElements(Deque<T> queue, int k) {

        Deque<T> stack = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            stack.push( queue.poll() ); //push first k element to stack in order to reverse them
        }

        while (!stack.isEmpty()){
            queue.add( stack.pop() ); //enqueue reversed elements
        }

        int remainingElements = queue.size() - k;
        for (int i = 0; i < remainingElements; i++) {
            queue.add( queue.poll() ); // enqueue remaining elements
        }
        return queue;
    }

}
/*
Given an integer K and a queue of integers, write code to reverse the order
of the first K elements of the queue.
-Input: Q = [10, 20, 30, 40, 50], K = 4
-Output: Q = [40,30, 20, 10,50]
Hint: You can use stack to reverse the order of first K elements
 */