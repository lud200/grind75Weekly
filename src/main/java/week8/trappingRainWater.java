package week8;

public class trappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int water = 0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                if(leftMax<height[left]){
                    leftMax = height[left];
                }else{
                    water = water + leftMax-height[left];
                }
            }else{
                right--;
                if(rightMax<height[right]){
                    rightMax = height[right];
                }else{
                    water = water+rightMax-height[right];
                }
            }
        }
        return water;
    }
}
