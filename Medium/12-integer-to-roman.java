// 12. Integer to Roman (Medium)
// https://leetcode.com/problems/integer-to-roman/
// Runtime: 4 ms  Memory: 46.2 MB
class Solution {
    int[]values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[]romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                sb.append(romans[i]);
                num-=values[i];
            }
        }
        return sb.toString();
    }
}
