package week6;

import java.util.HashSet;

/***
 * Given an integer array nums, return true if you can partition the array into
 * two subsets such that the sum of the elements in both subsets is equal or false otherwise.
 * Example 1:
 *
 * Input: nums = [1,5,11,5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * Example 2:
 *
 * Input: nums = [1,2,3,5]
 * Output: false
 * Explanation: The array cannot be partitioned into equal sum subsets.
 */
public class partitionEqualSubset {
    public boolean canPartition(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0, n = nums.length;
        set.add(sum);

        for(int i=0;i<n;i++){
            sum = sum+nums[i];
        }

        if(sum%2 != 0) return false;
        int target = sum/2;

        for(int num:nums){
            HashSet<Integer> tempSet = new HashSet<>(set);
            for(Integer k : tempSet){
                if(num+k==target) return true;
                if(num+k<target) set.add(num+k);
            }
        }
        return false;
    }
}
