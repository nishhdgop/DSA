class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        // for sorting the hashmap we can use the stream api
       
        LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
        hm.entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEachOrdered(x -> lm.put(x.getKey(), x.getValue()));

        int a[] =new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> p:lm.entrySet()){
            if(i==k) break;
            a[i]=p.getKey();
            i++;
        }
        return a;
    }
}
