package week5;

import java.util.ArrayList;
import java.util.List;

/***
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * Example 2:
 *
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 */
public class permutations {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permUtil(nums);
        return ans;
    }

    public void permUtil(int[] nums){
        if(ls.size() == nums.length){
            ans.add(new ArrayList<>(ls));
        }

        for(int i=0;i<nums.length;i++){
            if(ls.contains(nums[i])) continue;

            ls.add(nums[i]);
            permUtil(nums);
            ls.remove(ls.size()-1);
        }
    }
}
