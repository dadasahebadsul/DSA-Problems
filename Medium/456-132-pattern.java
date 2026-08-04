// 456. 132 Pattern (Medium)
// https://leetcode.com/problems/132-pattern/
// Runtime: 38 ms  Memory: 98.7 MB
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>s=new Stack<>();
        int sec=Integer.MIN_VALUE;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<sec){
                return true;
            }
            while(!s.isEmpty() && s.peek()<nums[i]){
                sec=s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}
