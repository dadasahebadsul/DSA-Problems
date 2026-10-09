// 169. Majority Element (Easy)
// https://leetcode.com/problems/majority-element/
// Runtime: 10 ms  Memory: 63.4 MB
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int count=1;
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            if(count>n/2){
                ans=nums[i];
            }

        }
        return ans;
    }
}
