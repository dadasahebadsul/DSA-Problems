class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>result=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char[] charWord=word.toCharArray();
            Arrays.sort(charWord);
            String key=new String(charWord);
            List<String>list;
            if(map.containsKey(key)){
                list=map.get(key);
                list.add(word);
                map.put(key,list);
            }else{
                list=new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }
        for(String key:map.keySet()){
            List<String>mapList=map.get(key);
            result.add(mapList);
        }
        return result;
    }
}