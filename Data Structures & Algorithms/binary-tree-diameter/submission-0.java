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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;

    }
    public DiaPair diameter(TreeNode root) {
        if(root == null) return new DiaPair();
        DiaPair lsd = diameter(root.left);
        DiaPair rsd = diameter(root.right);
        DiaPair dia = new DiaPair();
        int sd = lsd.ht+rsd.ht+2;
        dia.dt = Math.max(sd, Math.max(lsd.dt, rsd.dt));
        dia.ht = Math.max(lsd.ht, rsd.ht)+1;
        return dia;

    }
    class DiaPair{
        int dt = 0;
        int ht = -1;
    }
}
