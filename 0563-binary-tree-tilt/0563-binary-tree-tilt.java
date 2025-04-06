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
    static int tilt;
    public static int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int ans1=sum(root.left);
        int ans2=sum(root.right);
        tilt+=Math.abs(ans1-ans2);
       return ans1+ans2+root.val;
    }
    public int findTilt(TreeNode root) {
        tilt=0;
        sum(root);
        return tilt;
    }
}