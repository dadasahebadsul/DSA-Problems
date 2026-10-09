// 80. Remove Duplicates from Sorted Array II (Medium)
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Runtime: 1 ms  Memory: 48.5 MB
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            int val=nums[i];
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            if(count>2){
                nums[ans++]=val;
                nums[ans++]=val;
            }else{
                for(int j=0;j<count;j++){
                    nums[ans++]=val;
                }
            }
        }
        return ans;
    }
}
