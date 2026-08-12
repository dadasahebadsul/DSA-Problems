// 387. First Unique Character in a String (Easy)
// https://leetcode.com/problems/first-unique-character-in-a-string/
// Runtime: 32 ms  Memory: 46.9 MB
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
