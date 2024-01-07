package week5;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        comboUtil(candidates, target, 0);
        return ans;
    }

    public void comboUtil(int[] nums, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(ls));
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] <= target) {
                ls.add(nums[i]);
                comboUtil(nums, target - nums[i], i);
                ls.remove(ls.size() - 1);
            }
        }

    }
}
