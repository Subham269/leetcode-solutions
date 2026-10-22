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
    int num=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        num=0;
        TreeNode ans= helper(preorder,inorder,0,preorder.length-1);
        return ans;
    }
    public TreeNode helper(int[] preorder, int[] inorder, int left, int right)
    {
        if(left>right)
        return null;
        int mid;
        int val=preorder[num++];
        TreeNode root = new TreeNode(val);

        int i=mid=left;
        for(;i<=right;i++)
        {
            if(inorder[i]==val)
            {
                mid=i;
                break;
            }
            
        }

        root.left=helper(preorder,inorder, left, mid-1);
        root.right=helper(preorder,inorder,mid+1,right);

        return root;
    }
}