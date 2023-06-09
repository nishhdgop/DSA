//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.printMinIndexChar(str, patt));
        }
    }
}
// } Driver Code Ends


class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){
        
        // Your code here
        HashMap<Character,Integer> hm =new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(!hm.containsKey(S.charAt(i)))
            hm.put(S.charAt(i),i);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<patt.length();i++){
            if(hm.containsKey(patt.charAt(i))){
                if(min>hm.get(patt.charAt(i))){
                    min=hm.get(patt.charAt(i));
                }
            }
        }
        for(Map.Entry<Character,Integer> i:hm.entrySet()){
            if(i.getValue()==min)
            return ""+i.getKey();
        }
        return "$";
        // you don't need to print anything
    
    }
    
}
