class Solution {
    public static void printSubArrays(int[] arr,ArrayList<ArrayList<Integer>> al ,int start, int end)
    {
        if (end == arr.length)
            return;
        else if (start > end)
            printSubArrays(arr,al, 0, end + 1);
        else {
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = start; i <= end; i++)
               a.add(arr[i]);
         al.add(a);
            printSubArrays(arr,al, start + 1, end);
        }
        return;
    }
 
    public int sumOddLengthSubarrays(int[] arr) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
       printSubArrays(arr,al,0,0);
       int sum=0;
        for(ArrayList<Integer> a:al){
            if(a.size()%2!=0){
                for(int i:a){
                    sum+=i;
                }
            }
        }
        return sum;
    }
}
