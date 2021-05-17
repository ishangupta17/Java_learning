import java.io.*;
import java.util.*;

public class getsubseq{

    public static void main(String[] args) throws Exception {
Scanner s =new Scanner(System.in);
String str = s.next();
ArrayList<String> a =gss(str);
System.out.println(a);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char c = str.charAt(0);
        String st = str.substring(1);
        ArrayList<String> rgss = gss(st);
        
        ArrayList<String> mgss = new ArrayList<>(); 
        for(String s:rgss){
            mgss.add("" + s);
            
        }
         for(String s:rgss){
        
            mgss.add(c + s);
            
        }
        return mgss;
    }

}