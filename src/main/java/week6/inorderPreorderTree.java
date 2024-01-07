package week6;

/***
 Given two integer arrays preorder and inorder where preorder is the preorder traversal
 of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 ***/
public class inorderPreorderTree {

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

    int i=0, p=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildUtil(preorder, inorder, Integer.MIN_VALUE);
    }

    public TreeNode buildUtil(int[] preorder, int[] inorder, int stop){
        if(p>=preorder.length) return null;

        if(inorder[i] == stop) {
            ++i;
            return null;
        }

        TreeNode node = new TreeNode(preorder[p++]);
        node.left = buildUtil(preorder, inorder, node.val);
        node.right = buildUtil(preorder, inorder, stop);

        return node;
    }
}
