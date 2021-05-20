import java.util.*;
public class climbstairwithjumps{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    System.out.println(ways(n,arr));    
    } 

    public static int ways(int n ,int[] a){
    int [] dp = new int[n+1];
    dp[n]=1;
         for(int i=n-1;i>=0;i--){
          for(int j=1;j<=a[i] && i+j<dp.length;j++){
          dp[i] += dp[i+j];
        }}
        return dp[0];
    }
}