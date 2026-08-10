// 84. Largest Rectangle in Histogram (Hard)
// https://leetcode.com/problems/largest-rectangle-in-histogram/
// Runtime: 106 ms  Memory: 76.4 MB
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int []nser=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&& heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nser[i]=n;
            }else{
                nser[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        int[]nsel=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsel[i]=-1;
            }else{
                nsel[i]=s.peek();
            }
            s.push(i);
        }
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int height=heights[i];
            int weidth=nser[i]-nsel[i]-1;
            int area=height*weidth;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}
