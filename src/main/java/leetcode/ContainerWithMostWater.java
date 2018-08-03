package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/18 下午2:53
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int lo = 0,hi = height.length-1;
        int maxArea = 0;
        int loMax = lo;
        int hiMax = hi;
        while(hi>lo){
            if(height[hi] < height[hiMax]){
                hi--;
                continue;
            }
            if(height[lo] < height[loMax]){
                lo++;
                continue;
            }
            loMax = lo;
            hiMax = hi;
            int currentArea = Math.min(height[lo],height[hi])*(hi-lo);
            if(currentArea > maxArea) maxArea = currentArea;
            if(height[hi] < height[lo]){
                hi--;
            }else{
                lo++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {5,1,3,1,4,1,2};

        System.out.println(containerWithMostWater.maxArea(height));
    }
}
