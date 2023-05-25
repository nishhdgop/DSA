class Solution {
    public int partitionString(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else{
                i--;
                j++;
                hm.clear();
            }
        }
        return j+1;
    }
}
