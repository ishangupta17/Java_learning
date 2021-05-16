import java.io.*;
import java.util.*;

public class Printpermutation{

    public static void main(String[] args) throws Exception {
Scanner s = new Scanner(System.in);
String str=s.next();
printPermutations(str,"");
    }

    public static void printPermutations(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ssr=str.substring(i+1);
            String ssl=str.substring(0,i);
            String rest=ssl+ssr;
            printPermutations(rest,ans+ch);
        }
    }

}