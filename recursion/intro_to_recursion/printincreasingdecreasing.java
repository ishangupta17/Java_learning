import java.io.*;
import java.util.*;

public class printincreasingdecreasing {

    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    pdi(n);
    }

    public static void pdi(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    pdi(n-1);
    System.out.println(n);
    }

}