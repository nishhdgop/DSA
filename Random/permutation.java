package Random;
import java.util.*;
class permutation{
    public static ArrayList<ArrayList<Integer>> permute(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        String s = Integer.toString(n);
        for(int i=0;i<s.length();i++){
            al.add(Integer.parseInt(""+s.charAt(i)));
        }
        allpermutation(al,ans,0);
        return ans;
    }
    public static void allpermutation(ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ans, int ind){
        if(ind == al.size()-1){
           ArrayList<Integer> s = toString(al);
            ans.add(s);
            return;
        }
        for(int i=ind;i<al.size();i++){
            swap(i,ind,al);
            allpermutation(al,ans,ind+1);
            swap(i,ind,al);
        }
    }
    public static void swap(int i,int ind,ArrayList<Integer> al){
        int c1 = al.get(i);
        int c2 = al.get(ind);
        al.set(ind,c1);
        al.set(i,c2);
    }
    public static ArrayList<Integer> toString(ArrayList<Integer> al){
       // StringBuffer sb = new StringBuffer();
       ArrayList<Integer> al1 = new ArrayList<>();
        for(int i:al){
            al1.add(i);
        }
        return al1;
    }
    public static void main(String args[]){
        int n = 123;
        System.out.println(permute(n));
    }
}