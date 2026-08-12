// 3225. Length of Longest Subarray With at Most K Frequency (Medium)
// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
// Runtime: 75 ms  Memory: 88.6 MB
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int longestSubarray=Integer.MIN_VALUE;
        int left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            int length=right-left+1;
            longestSubarray=Math.max(longestSubarray,length);
        }
        return longestSubarray;
    }
}
