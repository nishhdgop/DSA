class Solution {
    public int distributeCandies(int[] candyType) {
        
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i=0;i<candyType.length;i++){
           hm.put(candyType[i],hm.getOrDefault(candyType[i],0)+1);
       }
       int n = candyType.length/2;
       int count=0;
    for(Map.Entry<Integer,Integer>i:hm.entrySet()){
        if(n>0){
            count++;
            n--;
        }
    }
    return count;
    }
}
