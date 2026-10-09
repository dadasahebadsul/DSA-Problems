// 13. Roman to Integer (Easy)
// https://leetcode.com/problems/roman-to-integer/
// Runtime: 11 ms  Memory: 47.9 MB
class Solution {
    /*int[]values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[]romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};*/
    public int romanToInt(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);

        int num=0;
        for(int i=0;i<s.length();i++){
            String ch=""+s.charAt(i);
            if(i<s.length()-1){
                String next=ch+s.charAt(i+1);
                if(map.containsKey(next) && map.get(ch)<map.get(next)){
                    ch=next;
                    i++;
                }
            }
            if(map.containsKey(ch)){
                num+=map.get(ch);
            }
            
        }
        return num;
        
    }
}
