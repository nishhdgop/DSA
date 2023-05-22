import java.util.*;
public class Main
{
    public static boolean isValid(char k,String s){
        //constant space and time so TC -> O(1)
        ArrayList<Character> al = new ArrayList<>();
        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');
        if(al.contains(k) && s.contains(""+k)){
            return true;
        }
        return false;
    }
    public static void rotate(String s){
        ArrayList<Character> al = new ArrayList<>();
        //Take only vowels into array
        for(int i=0;i<s.length();i++){
            if(isValid(s.charAt(i),s))
            al.add(s.charAt(i));
        }
        // Reference string for passing in functions
        String copy = s;
        char last = al.get(al.size()-1);
        al.remove(al.indexOf(last));
        // putting last vowel of string to first
        al.add(0,last);
        //result string
        String ans="";
        int j=0;
        // checking each character and then putting in the final answer
        //TC->O(length(s))
        for(int i=0;i<s.length();i++){
            if(isValid(s.charAt(i),copy)){
                ans+=""+al.get(j);
                j++;
            }else{
                ans+=""+s.charAt(i);
            }
        }
        //final answer
        System.out.println(ans);
    }
	public static void main(String[] args) {
		rotate("codesign");
	}
}
