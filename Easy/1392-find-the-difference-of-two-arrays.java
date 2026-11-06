// 1392. Find the Difference of Two Arrays (Easy)
// https://leetcode.com/problems/find-the-difference-of-two-arrays/
// Runtime: 12 ms  Memory: 47.4 MB
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();

        for(int num:map1.keySet()){
            if(!map2.containsKey(num)){
                l1.add(num);
            }
        }
        ans.add(l1);
        for(int num:map2.keySet()){
            if(!map1.containsKey(num)){
                l2.add(num);
            }
        }
        ans.add(l2);

        return ans;
    }
}
