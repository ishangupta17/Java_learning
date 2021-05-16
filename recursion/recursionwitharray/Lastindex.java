import java.io.*;
import java.util.*;

public class Lastindex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        System.out.print(lastIndex(a,a.length-1,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==-1){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
            return lastIndex(arr,idx-1,x);
        }
    }

}