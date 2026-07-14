// 1. Two Sum (Easy)
// https://leetcode.com/problems/two-sum/
// Runtime: 2 ms  Memory: 47.3 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hashMap=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
        

            if(hashMap.containsKey(res)){
                 return new int[] { hashMap.get(res), i };
            }

              hashMap.put(nums[i], i);
        }

        return new int[]{};


        
    }
}
