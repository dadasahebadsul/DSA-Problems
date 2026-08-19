// 1487. Cinema Seat Allocation (Medium)
// https://leetcode.com/problems/cinema-seat-allocation/
// Runtime: 33 ms  Memory: 55.7 MB
class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
        for(int[]num : reservedSeats){
            int row=num[0];
            int col=num[1];

            map.putIfAbsent(row,new HashSet<>());
            map.get(row).add(col);
        }
        int ans=2*n;
        for(int row:map.keySet()){
            HashSet<Integer>set=map.get(row);

            int group=2;
            boolean left=!set.contains(2) && !set.contains(3) && !set.contains(4)&& !set.contains(5);
            boolean middle=!set.contains(4) && !set.contains(5) && !set.contains(6)&& !set.contains(7);
            boolean right=!set.contains(6) && !set.contains(7) && !set.contains(8)&& !set.contains(9);

            if(left && right){
                group=2;
            }else if(left || right || middle){
                group=1;
            }else{
                group=0;
            }

            ans-=2;
            ans+=group;
        } 
        return ans; 
    }
}
