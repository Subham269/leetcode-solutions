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
    Deque<TreeNode> stack1 = new ArrayDeque<>();
    Deque<TreeNode> stack2 = new ArrayDeque<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null)
        return true;
        if(p==null || q==null)
        return false;
        while(p!=null || !stack1.isEmpty())
        {
            while(p!=null)
            {
                if(p==null || q==null)
                return false;
                if(q.val!=p.val)
                return false;
                stack2.push(q);
                stack1.push(p);
                p=p.left;
                q=q.left;
            }
            if(p==null && q!=null)
                return false;
            else if(p==null && q==null) 
            {
                p=stack1.pop();
                q=stack2.pop();
                q=q.right;
                p=p.right;
            }
        }
        if(p==null && q==null && stack1.isEmpty() && stack2.isEmpty())
        return true;
        return false;
    }
}