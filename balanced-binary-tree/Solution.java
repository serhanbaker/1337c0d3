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
    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return getHeight(root) > -1;
    }
    
    public static int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1 || leftHeight < 0 || rightHeight < 0)
            return -1;
        else
            return Math.max(leftHeight, rightHeight) + 1;
    }
}
