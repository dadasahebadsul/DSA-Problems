class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer>map2=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int left=0;
        String ans="";
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            while(toCompare(map1,map2)){
                int len=right-left+1;
                if(len<min){
                    min=len;
                    ans=s.substring(left,right+1);
                }
                char leftChar=s.charAt(left);
                map2.put(leftChar,map2.get(leftChar)-1);
                if(map2.get(leftChar)==0){
                    map2.remove(leftChar);
                }
                left++;
            }
        }
        return ans;
    }
    public boolean toCompare(HashMap<Character,Integer>map1, HashMap<Character,Integer>map2){
        for(char key:map1.keySet()){
            if(!map2.containsKey(key) || map1.get(key)>map2.get(key)){
                return false;
            }
        }
        return true;
    }
}