// 3276. Minimum Number of Pushes to Type Word II (Medium)
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
// Runtime: 65 ms  Memory: 48.2 MB
class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Pair>list=new ArrayList<>();
        for(char ch:map.keySet()){
            list.add(new Pair(ch,map.get(ch)));
        }
        Collections.sort(list,(a,b)->{
            return b.value-a.value;
        });
        int pushesh=0;
        for(int i=0;i<list.size();i++){
            pushesh+=((i/8)+1)*list.get(i).value;
        }
        return pushesh;

    }
}
class Pair{
    char ch;
    int value;
    Pair(char ch,int value){
        this.ch=ch;
        this.value=value;
    }
}
