class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>list=new ArrayList<>();
        int lowLength=String.valueOf(low).length();
        int highLength=String.valueOf(high).length();

        for(int len=lowLength;len<=highLength;len++){
            for(int start=1;start<=10-len;start++){
                int num=0;
                int digit=start;
                for(int i=0;i<len;i++){
                    num=num*10+digit;
                    digit++;
                }
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}