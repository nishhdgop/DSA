/* Problem is to fined the nearest power of 2 to a given number */
/* 

Example 1:
Input:
X = 3,
Output:
4
Explanation:
Nearest station from X = 3 is 2 and
4. Since 4 is present in the rightmost
position therefore 4 is the answer.

Input:
X = 2,
Output:
2
Explanation:
Nearest station from X = 2 is 2.

*/

class Solution{
    public long refueling(int X){
        // Code your solution here. 
    int prev = 0;
    int next=0;
    int i=0;
    while(next>X==false){
        prev = next;
        next=  (int)Math.pow(2,i);
        i++;
    }
    if(Math.abs(prev-X)<Math.abs(next-X)){
        return prev;
    }
    else
    return next;
    }
}
