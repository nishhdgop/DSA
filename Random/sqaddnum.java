class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0;
        long e=(long)Math.sqrt(c);
        while(s<=e){
            long mid = s*s+e*e;
            if(mid==c){
                return true;
            }else if(mid>c){
                e--;
            }else{
                s++;
            }
        }
        return false;
    }
}
