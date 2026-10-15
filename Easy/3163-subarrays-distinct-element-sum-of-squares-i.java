// 3163. Subarrays Distinct Element Sum of Squares I (Easy)
// https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
// Runtime: 172 ms  Memory: 46.5 MB
class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                for(int k=i;k<=j;k++){
                    list.add(nums.get(k));
                }
            int x=distinctCount(list);
            list=new ArrayList<>();
            sum+=x*x;
            }
        }
        return sum;

    }
    public int distinctCount(ArrayList<Integer>list){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        return map.size();
    }
}
