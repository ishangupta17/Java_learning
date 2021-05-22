import java.io.*;
import java.util.*;
public class targetsumsubsets{

    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int[] arr =new int[n];
    for(int i =0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int tar=s.nextInt();
    System.out.print(subset(arr,n,tar));
    }
    public static boolean subset(int[] a,int n,int t){
      boolean[][] dp =new boolean[n+1][t+1];
      for(int i =0;i<n+1;i++){
          for(int j=0;j<t+1;j++){
             if(i==0 && j==0){
              dp[i][j]=true;
             }
             else if(j==0){
              dp[i][j]=true;
             }
             else if(i==0){
              dp[i][j]=false;
             }
             else{
                  if(dp[i-1][j] == true){
                    dp[i][j]=true;
                  }
                  else{
                      if(j>=a[i-1]){
                        dp[i][j]=dp[i-1][j-a[i-1]]==true?true:false;
                      }
                  }
             }
          }
      }
    return dp[n][t];
    }
}