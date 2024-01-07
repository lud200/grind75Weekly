package week6;

import java.util.ArrayList;
import java.util.List;

/***
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 * Example 2:
 *
 * Input: root = [1,null,3]
 * Output: [1,3]
 */
public class binarytreeRightView {

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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        rightUtil(ls, root, 0);
        return ls;
    }

    public void rightUtil(List<Integer> ls, TreeNode root, int depth){
        if(root == null) return;

        if(ls.size() == depth){
            ls.add(root.val);
        }

        rightUtil(ls, root.right, depth+1);
        rightUtil(ls, root.left, depth+1);
    }
}
