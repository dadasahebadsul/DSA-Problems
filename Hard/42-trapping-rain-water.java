// 42. Trapping Rain Water (Hard)
// https://leetcode.com/problems/trapping-rain-water/
// Runtime: 1 ms  Memory: 48.9 MB
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[]lhs=new int[n];
        lhs[0]=height[0];
        for(int i=1;i<n;i++){
            lhs[i]=Math.max(lhs[i-1],height[i]);
        }
        int[]rhs=new int[n];
        rhs[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rhs[i]=Math.max(rhs[i+1],height[i]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(lhs[i],rhs[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
}
