import java.io.*;
import java.util.*;

public class Maxofarray{

    public static void main(String[] args) throws Exception {
        Scanner  s =new Scanner(System.in);
        int n= s.nextInt();
        int[] ar= new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        System.out.println(maxOfArray(ar,0));
    }

    public static int maxOfArray(int[] arr, int idx){
    if(idx==arr.length-1){
        return arr[idx];
    }
    int max = maxOfArray(arr,idx+1);
    
    if(max>arr[idx]){
        return max;
    }
    else{
        return arr[idx];
    }
    }

}