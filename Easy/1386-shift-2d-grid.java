// 1386. Shift 2D Grid (Easy)
// https://leetcode.com/problems/shift-2d-grid/
// Runtime: 9 ms  Memory: 47.2 MB
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        if(k>(n*m)){
            k=k%(n*m);
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(grid[i][j]);
            }
        }
        reverse(list,0,list.size()-1);
        reverse(list,0,k-1);
        reverse(list,k,list.size()-1);

        int index=0;
        for(int i=0;i<n;i++){
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(list.get(index));
                index++;
            }
            ans.add(row);
        }
        return ans;
    }
    public void reverse(List<Integer>list,int num1,int num2){
        while(num1<num2){
            int temp=list.get(num1);
            list.set(num1, list.get(num2));
            list.set(num2, temp);

            num1++;
            num2--;
        }
    }
}
