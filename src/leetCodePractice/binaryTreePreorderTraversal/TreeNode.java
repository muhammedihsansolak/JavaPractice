package leetCodePractice.binaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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

    //Pre-Order traversal: Root -> Left -> Right

    /**
     * result is an ArrayList to store the nodes in the order of traversal.
     * stack is a Deque for tracking the nodes to be visited.
     * The code follows these steps:
     *
     * a. If the root is null, the function returns an empty result list.
     *
     * b. Initialize the stack with the root node.
     *
     * c. Iterate while the stack is not empty.
     *
     * d. Inside the loop, the code pops a node from the stack, adds it to the result list, and then pushes its right and left children onto the stack.
     *
     * e. This ensures that nodes are visited in the node, left, right order, which is characteristic of pre-order traversal.
     */

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        return result;
    }

}
