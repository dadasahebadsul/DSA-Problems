// 4107. Find Missing Elements (Easy)
// https://leetcode.com/problems/find-missing-elements/
// Runtime: 3 ms  Memory: 46.6 MB
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            smallest=Math.min(smallest,nums[i]);
            largest=Math.max(largest,nums[i]);
            map.put(nums[i],1);
        }
        for(int i=smallest;i<=largest;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}
