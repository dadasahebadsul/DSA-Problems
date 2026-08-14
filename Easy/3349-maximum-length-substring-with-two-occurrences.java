// 3349. Maximum Length Substring With Two Occurrences (Easy)
// https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
// Runtime: 3 ms  Memory: 44.3 MB
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            int length=right-left+1;
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}
