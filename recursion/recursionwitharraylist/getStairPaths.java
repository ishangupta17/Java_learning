import java.io.*;
import java.util.*;

public class getStairPaths{

    public static void main(String[] args) throws Exception {
Scanner s = new Scanner(System.in);
int n =s.nextInt();
System.out.print(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> rec = new ArrayList<>();
            rec.add("");
            return rec;
        }
        else if(n<0){
            ArrayList<String> rec = new ArrayList<>();
            return rec;
        }
        ArrayList<String> arr = new ArrayList();
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        for(String s:path1){
            arr.add(1+s);
        }
        for(String s:path2){
            arr.add(2+s);
        }
        for(String s:path3){
            arr.add(3+s);
        }
        return arr;
    }

}