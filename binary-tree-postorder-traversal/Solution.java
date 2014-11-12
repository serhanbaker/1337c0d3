/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> resultSet = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode lastVisited = null;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode cur = stack.peek();
                if (cur.right != null && lastVisited != cur.right) {
                    // if right child exists and we're coming from left, move right. 
                    // are we on the parent of a subtree and haven't visited the right yet? then visit it first.
                    root = cur.right;
                } else {
                    stack.pop();
                    resultSet.add(cur.val);
                    lastVisited = cur;
                }
            }
        }
        return resultSet;
    }
}