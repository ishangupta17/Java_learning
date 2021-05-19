import java.io.*;
import java.util.*;

public class fibonacci{

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int arr[] = new int[n+1];
    System.out.println(fibonaccitab(n));
    System.out.println(fibonaccimem(n,arr));
}
    public static int fibonaccimem(int n, int[] arr){
        if(n==0 || n==1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        int fibn=fibonaccimem(n-2,arr)+fibonaccimem(n-1,arr);
        arr[n]=fibn;
        return fibn;
        
    }
    public static int fibonaccitab(int n){
    int[] a = new int[n+1];
    a[0]=0;
    a[1]=1;
    for(int i=2;i<=n;i++){
        a[i]=a[i-1]+a[i-2];
    }
    return a[n];
    }
 

}