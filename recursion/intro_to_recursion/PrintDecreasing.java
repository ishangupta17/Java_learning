import java.io.*;
import java.util.Scanner;
public class PrintDecreasing{
    public static void main(String[] args) {
        
    
        int num;
        Scanner s= new Scanner(System.in);
        num=s.nextInt();
        printD(num);
    }

    public static void printD(int n){
        if(n>=1){
        
        
     System.out.println(n);
     n--;
     printD(n);
    }}
}
