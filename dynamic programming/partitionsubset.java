import java.util.*;
public class partitionsubset{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int[][] dp=new int[k+1][n+1];
    for(int i=1;i<=k;i++){
        for(int j=1;j<=n;j++){
            if(j<i){
                dp[i][j]=0;
            }
            else if(i==j){
                dp[i][j]=1;
            }
            else{
                dp[i][j]=(i*dp[i][j-1])+dp[i-1][j-1];
            }
        }
    }
    System.out.print(dp[k][n]);
    }
}