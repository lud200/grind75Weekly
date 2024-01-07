package week5;

/***
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k
 * (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */
public class searchRotatedSortedArray {

    public int search(int[] nums, int target) {
        return searchUtil(nums, target, 0, nums.length-1);
    }

    public int searchUtil(int[] nums, int target, int low, int high){
        if(low>high) return -1;

        int mid = (low+high)/2;

        if(target == nums[mid]) return mid;

        if(nums[low]<=nums[mid]){
            if(target<=nums[mid] && target>=nums[low])
                return searchUtil(nums, target, low, mid-1);
            return searchUtil(nums, target, mid+1, high);
        }
        if(target<=nums[high] && target>=nums[mid])
            return searchUtil(nums, target, mid+1, high);
        return searchUtil(nums, target, low, mid-1);
    }

}
