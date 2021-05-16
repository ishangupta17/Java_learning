import java.io.*;
import java.util.*;

public class Disparrayreverse{

    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    displayArrReverse(arr,arr.length-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {

    if(idx<0){
        return;
    }
    System.out.println(arr[idx]);
    displayArrReverse(arr,idx-1);
    }

}