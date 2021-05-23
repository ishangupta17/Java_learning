import java.io.*;
import java.util.*;

public class painthouse{

    public static void main(String[] args) throws Exception {
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int[][] a=new int[n][3];
for(int i=0;i<n;i++){
    for(int j=0;j<3;j++){
        a[i][j]=s.nextInt();
    }
}
int dp[][]=new int[3][n];
dp[0][0]=a[0][0];
dp[1][0]=a[0][1];
dp[2][0]=a[0][2];

for(int j=1;j<n;j++){
    for(int i=0;i<3;i++){
      if(i==0){
          dp[i][j]=Math.min(dp[i+1][j-1],dp[i+2][j-1])+a[j][i];
      }
      else if(i==1){
          dp[i][j]=Math.min(dp[i+1][j-1],dp[i-1][j-1])+a[j][i];
      }
      else{
          dp[i][j]=Math.min(dp[i-1][j-1],dp[i-2][j-1])+a[j][i];
      }
    }
}
System.out.print(Math.min(dp[0][n-1],Math.min(dp[1][n-1],dp[2][n-1])));
    }
}