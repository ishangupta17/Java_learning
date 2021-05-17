import java.io.*;
import java.util.*;

public class getmazepathwithjump {

    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
int n = s.nextInt();
int m = s.nextInt();
System.out.println(getMazePaths(1,1,n,m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
         if(sr==dr && sc==dc){
            ArrayList<String> sty=new ArrayList<>();
            sty.add("");
            return sty;
        }
        ArrayList<String> path = new ArrayList<>();
        for(int i =1;i<=dc-sc;i++){
           ArrayList<String> a = getMazePaths(sr,sc+i,dr,dc);
           for(String h:a){
               path.add("h"+i+h);
               
           }
        }
        for(int i=1;i<=dr-sr;i++){
          ArrayList<String> a =  getMazePaths(sr+i,sc,dr,dc);
          for(String v:a){
               path.add("v"+i+v);
               
           }
        }
        for(int i =1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList<String> a =getMazePaths(sr+i,sc+i,dr,dc);
            for(String d:a){
               path.add("d"+i+d);
               
           }
        }
        return path;
    }

}