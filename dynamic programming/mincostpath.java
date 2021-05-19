import java.util.*;
public class mincostpath{
    public static void main(String[] args){
    Scanner  s= new Scanner(System.in);
    int n =s.nextInt();
    int m=s.nextInt();
    int[][] arr = new int[n][m];
    for(int i =0;i<n;i++){
     for (int j=0;j<m;j++){
         arr[i][j]=s.nextInt();
     }System.out.println("");
    }
    System.out.print(mincost(arr,n,m));
    }

    public static  int mincost(int[][] a,int n ,int m){
        int[][] dp =new int[n][m];
        for(int i=n-1;i>=0;i--){
          for(int j=m-1;j>=0;j--){
            if(i==n-1 && j==m-1 ){
                dp[i][j]=a[i][j];
            }
            else if(i==n-1){
                dp[i][j] =a[i][j]+ dp[i][j+1];
            }
            else if(j==m-1){
                dp[i][j] =a[i][j]+ dp[i+1][j];
            }
            else{
               if(dp[i][j+1]<dp[i+1][j]){
                dp[i][j] = a[i][j] + dp[i][j+1];
               }
               else{
                dp[i][j] = a[i][j] + dp[i+1][j];
               }
            }
          }
        }
    return dp[0][0];
    }
}