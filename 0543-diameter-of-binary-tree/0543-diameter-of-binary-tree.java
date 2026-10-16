/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        int right=depth(root.right);
        int left=depth(root.left);
        return Math.max(right+left, mainguy(root));
    }
    public int mainguy(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int depths=depth(root.right) + depth(root.left);
        if(max<depths)
        max=depths;
        mainguy(root.left);
        mainguy(root.right);
        return max;
    }
    public int depth(TreeNode root)
    {
        if(root==null)
        return 0;
        return Math.max(depth(root.right),depth(root.left)) + 1;
    }
}