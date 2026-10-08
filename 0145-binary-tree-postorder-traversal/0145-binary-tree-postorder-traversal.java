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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        while(root!=null||!stack.isEmpty())
        {
            if(root!=null)
            {
                list.add(root.val);
                stack.push(root);
                root=root.right;
            }
            else
            {
                root=stack.pop();
                root=root.left;
            }
        }
        Collections.reverse(list);
        return list;

    }
}