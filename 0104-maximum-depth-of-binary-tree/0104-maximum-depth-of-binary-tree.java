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
    Deque<TreeNode> stack = new ArrayDeque<>();
    Deque<Integer> depths = new ArrayDeque<>();
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int max=1;
        stack.push(root);
        depths.push(1);
        while(!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            int depth=depths.pop();

            if(node.left==null && node.right==null)
            max=Math.max(max,depth);

            if(node.left!=null)
            {
                stack.push(node.left);
                depths.push(depth+1);
            }
            if(node.right!=null)
            {
                stack.push(node.right);
                depths.push(depth+1);
            }
        }
        return max;
    }
}