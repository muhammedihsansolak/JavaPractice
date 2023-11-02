package leetCodePractice.binaryTreePostorderTraversal;

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

    //Post-Order traversal: Left -> Right -> Root

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
     * d. Inside the loop, the code pops a node from the stack, but unlike in-order and pre-order traversal, it adds the node's value to the beginning of the result list (result.add(0, current.val)). This ensures that nodes are visited in the left, right, node order, characteristic of post-order traversal.
     *
     * e. The code then pushes the left and right children onto the stack.
     */

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(0, current.val);
            if (current.left != null) stack.push(current.left);
            if (current.right != null) stack.push(current.right);
        }
        return result;
    }

}
