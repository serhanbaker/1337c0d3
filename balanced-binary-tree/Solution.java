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
    public static boolean isBalanced(TreeNode root){
        if (root == null)
            return true;
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int getHeight(TreeNode root){
        if (root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}