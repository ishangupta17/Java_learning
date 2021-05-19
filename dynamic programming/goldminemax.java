import java.util.*;
public class goldminemax {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          arr[i][j]=s.nextInt();
        }
    }
    System.out.print(goldmax(arr,n,m));

}
public static int goldmax(int[][] a, int n,int m){
int max=0;
int dp[][] =new int[n][m];
for(int j=m-1;j>=0;j--){
    for(int i=0;i<=n-1;i++){
        int maxe=0;
        if(j==m-1){
         dp[i][j]=a[i][j];
        }
        else if(0<i && i<n-1){
        maxe=Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));
        dp[i][j]= maxe + a[i][j];
        }
        else if(i==0){
        maxe=Math.max(dp[i][j+1],dp[i+1][j+1]);
        dp[i][j]= maxe + a[i][j];
        }
        else{
        maxe=Math.max(dp[i-1][j+1],dp[i][j+1]);
        dp[i][j]= maxe + a[i][j];
        }
        
    }
}
for(int i=0;i<n;i++){
    max=dp[i][0]>max?dp[i][0]:max;
}
return max;
}
}