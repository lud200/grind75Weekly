package week4;

/***
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left
 * subtree
 *  of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class validateBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if (root.left != null && root.val < maxValue(root.left))
            return false;
        if (root.right != null && root.val > minValue(root.right))
            return false;

        if (!isValidBST(root.left) || !isValidBST(root.right))
            return false;
        return true;
    }

    public int maxValue(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        int val = root.val;
        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(val, Math.max(leftMax, rightMax));
    }

    public int minValue(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;

        int val = root.val;
        int leftMin = minValue(root.left);
        int rightMin = minValue(root.right);

        return Math.min(val, Math.min(leftMin, rightMin));
    }

}
