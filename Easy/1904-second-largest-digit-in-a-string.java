// 1904. Second Largest Digit in a String (Easy)
// https://leetcode.com/problems/second-largest-digit-in-a-string/
// Runtime: 2 ms  Memory: 42.7 MB
class Solution {
    public int secondHighest(String s) {
        int firstLarge=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                if((ch-'0')>firstLarge){
                    secLarge=firstLarge;
                    firstLarge=(ch-'0');
                }else if(((ch-'0')>secLarge) && ((ch-'0')<firstLarge)){
                    secLarge=(ch-'0');
                }
            }
        }
        if(secLarge==Integer.MIN_VALUE){
            return -1;
        }else{
            return secLarge;
        }
    }
}
