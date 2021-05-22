import java.util.*;
public class maxsumnonadjacent  {

    public static void main(String[] args) throws Exception {
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=s.nextInt();
}
int dp[][]=new int[2][n];
dp[0][0]=a[0];
dp[1][0]=0;
for(int j=1;j<n;j++){
    for(int i=0;i<2;i++){
        dp[i][j]=i==0?(dp[i+1][j-1]+a[j]):Math.max(dp[i-1][j-1],dp[i][j-1]);
    }
}
System.out.print(Math.max(dp[0][n-1],dp[1][n-1]));
    }
}