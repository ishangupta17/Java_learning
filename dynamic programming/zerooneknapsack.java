import java.util.*;
public class zerooneknapsack {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] v=new int[n];
        int[] w=new int[n];
        
        for(int i=0;i<n;i++){
         v[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            w[i]=s.nextInt();
           }
           int cap=s.nextInt();
           int dp[][]=new int[n+1][cap+1];
           for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
             dp[i][j]=dp[i-1][j];
                if(j>=w[i-1]){
                if(dp[i-1][j-w[i-1]]+v[i-1]>dp[i-1][j]){
                  dp[i][j]=dp[i-1][j-w[i-1]]+v[i-1];
                }
             }
            }
           }
           System.out.print(dp[n][cap]);
    }
}
