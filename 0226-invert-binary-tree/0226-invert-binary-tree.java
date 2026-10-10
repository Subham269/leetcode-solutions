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
    Deque<TreeNode> stack= new ArrayDeque<>();
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return null;
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode head=stack.pop();
            TreeNode temp = head.right;
            head.right=head.left;
            head.left=temp;
            if(head.left!=null)
            {
                stack.push(head.left);
            }
            if(head.right!=null)
            {
                stack.push(head.right);
            }
        }
        return root;
    }
}