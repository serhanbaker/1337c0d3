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
    // morris traversal
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> resultSet = new ArrayList<Integer>();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur)
                    prev = prev.right;
                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    prev.right = null;
                    resultSet.add(cur.val);
                    cur = cur.right;
                }
            } else {
                resultSet.add(cur.val);
                cur = cur.right;
            }
        }
        return resultSet;
    }
}