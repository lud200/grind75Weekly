package week6;

import java.util.ArrayList;
import java.util.List;

public class subsets {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subUtil(nums, 0);
        return ans;
    }

    public void subUtil(int[] nums, int start){
        ans.add(new ArrayList<>(ls));

        for(int i=start;i<nums.length;i++){
            ls.add(nums[i]);
            subUtil(nums, i+1);
            ls.remove(ls.size()-1);
        }
    }
}
