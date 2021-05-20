import java.io.*;
import java.util.*;

public class climbstairwithminmove {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(moves(a,n));
    }
    public static int moves(int[] arr,int n){
     int[] dp =new int[n+1];
     dp[n]=0;
     for(int i=n-1;i>=0;i--){
        if(arr[i]==0){
            dp[i]=0;
        }
        else{
            int min=Integer.MAX_VALUE;
         for(int j=1;j<=arr[i] && i+j<dp.length;j++){
             if(dp[i+j] != 0){
          min=Math.min(min,dp[i+j]);
               }
            else if(i+j==(dp.length-1)){
                min=0;
            }
            }
            if(min != Integer.MAX_VALUE){
             dp[i] =min+1;
            }
            else{
                dp[i]=0;
            }
            
        }
     }
     return dp[0];
    }
}
        