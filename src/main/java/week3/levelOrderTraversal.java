package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/***
 * Given the root of a binary tree,
 * return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class levelOrderTraversal {
    class TreeNode {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        int level = 1;
        levelOrderUtil(map, root, level);

        return new ArrayList<>(map.values());
    }

    public void levelOrderUtil(TreeMap<Integer, List<Integer>> map, TreeNode root, int level){
        if(root == null) return;

        List<Integer> list = map.get(level);
        if(list == null){
            list = new ArrayList<>();
        }

        list.add(root.val);
        map.put(level, list);

        levelOrderUtil(map, root.left, level+1);
        levelOrderUtil(map, root.right, level+1);
    }

}
