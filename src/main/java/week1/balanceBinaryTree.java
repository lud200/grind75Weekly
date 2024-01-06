package week1;

/***
 * Given a binary tree, determine if it is
 * height-balanced
 *
 */
public class balanceBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(isBalanced(root.left) && isBalanced(root.right) && Math.abs(leftHeight-rightHeight)<=1)
            return true;

        return false;
    }

    public static int height(TreeNode root){
        if(root == null) return 0;

       return 1+Math.max(height(root.right), height(root.left));
    }



}

