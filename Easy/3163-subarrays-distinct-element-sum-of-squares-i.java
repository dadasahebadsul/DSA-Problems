// 3163. Subarrays Distinct Element Sum of Squares I (Easy)
// https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
// Runtime: 9 ms  Memory: 46.4 MB
class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i;j<nums.size();j++){
                map.put(nums.get(j),0);
                int count=map.size();
                sum+=count*count;
            }
        }
        return sum;
    }
}
