package week1;

/***
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return searchUtil(nums, target, 0, nums.length - 1);
    }

    public static int searchUtil(int[] nums, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;
        if (target == nums[mid]) return mid;

        if (target < nums[mid])
            return searchUtil(nums, target, low, mid - 1);
        return searchUtil(nums, target, mid + 1, high);
    }
}
