// 486. Predict the Winner (Medium)
// https://leetcode.com/problems/predict-the-winner/
// Runtime: 65 ms  Memory: 42.5 MB
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int diff=solve(nums,0,nums.length-1);
        return diff>=0;
    }
    public int solve(int[]nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int pickLeft=nums[left]-solve(nums,left+1,right);
        int pickRight=nums[right]-solve(nums,left,right-1);
        return Math.max(pickLeft,pickRight);
    }
}
