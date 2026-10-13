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
    Deque<TreeNode> stack1= new ArrayDeque<>();
    Deque<TreeNode> stack2= new ArrayDeque<>();
    public boolean isSymmetric(TreeNode root) {
        TreeNode root1=reverseTree(root);
        if(root==null&&root1==null)
        return true;
        if(root==null||root1==null)
        return false;
        while(root!=null || !stack1.isEmpty())
        {
        while(root!=null)
        {
            if(root1==null)
            return false;
            if(root.val!=root1.val)
            return false;
            stack1.push(root);
            root=root.left;
            stack2.push(root1);
            root1=root1.left;
        }
        if(root==null&&root1!=null)
        return false;
        else if(root==null && root1==null)
        {
            root=stack1.pop();
            root1=stack2.pop();
            root=root.right;
            root1=root1.right;
        }
        }
        return true;
    }
    public TreeNode reverseTree(TreeNode node)
    {
        if(node == null )
        return null;
        TreeNode root=new TreeNode(node.val);
        root.left=reverseTree(node.right);
        root.right=reverseTree(node.left);
        return root;
    }
}