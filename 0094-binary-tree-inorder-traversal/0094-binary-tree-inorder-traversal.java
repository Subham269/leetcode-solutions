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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode head = root;
        List<Integer> list = new ArrayList<>();
        while(head!=null || !stack.isEmpty())
        {
            while(head!=null)
            {
                stack.push(head);
                head=head.left;
            }
            head = stack.pop();
            list.add(head.val);
            head = head.right;
        }
        return list;

    }
}