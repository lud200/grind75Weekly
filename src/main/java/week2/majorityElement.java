package week2;

import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
