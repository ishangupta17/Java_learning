import java.io.*;
import java.util.*;

public class getmazepath {

    public static void main(String[] args) throws Exception {
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
ArrayList<String> path = getMazePaths(0,0,n-1,m-1);
System.out.print(path);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hori = new ArrayList<>();
        ArrayList<String> veri = new ArrayList<>();
        
        if(sc<dc){hori = getMazePaths(sr,sc+1,dr,dc);
            
        }
        
        if(sr<dr){veri =  getMazePaths(sr+1,sc,dr,dc);
            
        }
        ArrayList<String> path = new ArrayList<>();
        for(String he:hori){
            path.add("h"+ he);
        }
        for(String ve:veri){
            path.add("v"+ ve);
        }
        return path;
    }

}