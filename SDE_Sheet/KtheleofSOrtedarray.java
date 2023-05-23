

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
      int arr3[]=new int[m+n];
      System.arraycopy(arr1,0,arr3,0,n);
      System.arraycopy(arr2,0,arr3,n,m);
      Arrays.sort(arr3);
      return arr3[k-1];
        
    }
}
