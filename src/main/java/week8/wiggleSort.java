package week8;

import java.util.Arrays;

public class wiggleSort {
    public static void main(String[] args){
        int[] nums = {1,5,1,1,6,4};
        nums = wiggleSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }

    public static int[] wiggleSort(int[] nums){
        int n = nums.length-1;
        int[] newArr = Arrays.copyOf(nums, n+1);

        Arrays.sort(newArr);

        for(int i=1;i<n;i=i+2){
            nums[i] = newArr[n--];
        }

        for(int i=0;i<n;i=i+2){
            nums[i] = newArr[n--];
        }
        return nums;
    }
}
