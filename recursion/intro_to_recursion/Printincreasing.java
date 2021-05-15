import java.io.*;
import java.util.*;

public class Printincreasing {

    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();
        printIncreasing(num);
    }

    public static void printIncreasing(int n){
    if(n==0){
        return;
    }
    printIncreasing(n-1);
    System.out.println(n);
        
    }

}