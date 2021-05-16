import java.io.*;
import java.util.*;

public class Disparray {

    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        displayArr(a,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx<arr.length){
            
        
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);}
    }

}