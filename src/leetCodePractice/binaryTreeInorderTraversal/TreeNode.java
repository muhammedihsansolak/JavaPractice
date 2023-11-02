package leetCodePractice.binaryTreeInorderTraversal;

import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    //In-Order traversal: Left -> Root -> Right

    /**
     * In-order traversal is a depth-first approach that explores the left subtree of a node before visiting the node itself and then the right subtree. This results in nodes being visited in **ascending order**, making it especially useful for binary search trees (BSTs). The in-order traversal code you provided uses an iterative approach with a stack to simulate the recursion, making it more memory-efficient.
     * <p>
     * "result" is an ArrayList that will store the nodes in the order of the traversal.
     * "stack" is a Deque (usually implemented as a LinkedList) used to keep track of the nodes to be visited.
     * "current" is a TreeNode that starts with the root of the tree.
     * <p>
     *     The code follows these steps:
     *
     * a. Initialize the current node with the root node and iterate as long as either current is not null or the stack is not empty.
     *
     * b. Inside the first while loop, the code pushes the current node and all its left descendants onto the stack. This process ensures that the left subtree is traversed first.
     *
     * c. After all left descendants have been pushed onto the stack, the code pops a node from the stack, adds it to the result list, and then moves to the right child of the current node.
     *
     * d. This process continues until all nodes have been traversed, and the result list contains nodes in ascending order.
     */

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }

}
