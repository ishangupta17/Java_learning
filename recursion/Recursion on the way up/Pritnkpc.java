import java.io.*;
import java.util.*;

public class Pritnkpc{

    public static void main(String[] args) throws Exception {
Scanner  s= new Scanner (System.in);
String str=s.next();
printKPC(str,"");
    }
static String[] arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        str=str.substring(1);
        String sy = arr[ch - '0'];
        
        for(int i=0;i<sy.length();i++){
            char chi =sy.charAt(i);
            printKPC(str,asf+chi);
        }
    }

}