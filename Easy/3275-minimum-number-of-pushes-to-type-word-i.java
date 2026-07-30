// 3275. Minimum Number of Pushes to Type Word I (Easy)
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/
// Runtime: 0 ms  Memory: 43.5 MB
class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int pushesh=0;

        for(int i=0;i<n;i++){
            pushesh+=(i/8)+1;
        }
        return pushesh;
    }
}
