package RecursionInJava;

import java.util.HashSet;

public class Recursion14 {
    public static void subsequences(String str , int index ,String newString , HashSet<String> set){
        if(index == str.length()){
           if(set.contains(newString)){
            return;
           }else {
            System.out.println(newString);
            set.add(newString);
            return;
           }
            
        }

        char currChar = str.charAt(index);
         subsequences(str, index+1, newString+currChar , set);
         
         subsequences(str, index+1, newString ,set) ;
    }
    public static void main(String[] args) {
       String str = "aaa";
       HashSet<String> set = new HashSet<>();
       subsequences(str, 0, "" ,set);
    }
}
