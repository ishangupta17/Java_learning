import java.io.*;
import java.util.*;

public class getkpc{

    public static void main(String[] args) throws Exception {
Scanner  s = new Scanner(System.in);

String n=s.next();
System.out.print(getKPC(n));

    }
    static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;}
        char ss = str.charAt(0);
        String se = str.substring(1);
        ArrayList<String> newarr = getKPC(se);
        
        String s1=arr[ss -'0'];
        ArrayList<String> mgg = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<newarr.size();j++){
                mgg.add(s1.charAt(i) + newarr.get(j));
            }
        }
        return mgg;
        
    }

}