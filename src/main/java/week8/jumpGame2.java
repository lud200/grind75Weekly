package week8;

public class jumpGame2 {
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        int result = jump(nums);
        System.out.println(result);
    }

    public static int jump(int[] nums) {
        int goal = 0, cur = 0, end = 0;
        int n = nums.length-1;

        for(int i=0;i<n;i++){
            end = Math.max(end, i+nums[i]);
            if(i == cur){
                goal++;
                cur = end;
            }
        }
        return goal;
    }
}
