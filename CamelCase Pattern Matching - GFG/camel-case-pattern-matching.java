//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here\
        ArrayList<String>al =new ArrayList<>();
        for(String s:Dictionary){
            String k="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                    k+=""+s.charAt(i);
                if(k.compareTo(Pattern)==0){
                al.add(s);
                
                  }
                }
            }
            
        }
        Collections.sort(al);
        if(al.size()==0){
            al.add("-1");
        }
        return al;
    }
}