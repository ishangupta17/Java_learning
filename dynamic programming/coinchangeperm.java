import java.util.*;
public class coinchangeperm{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
a[i]=s.nextInt();
    }
    int tar=s.nextInt();
    int dp[] = new int[tar+1];
    dp[0]=1;
for(int i=1;i<dp.length;i++){
    for(int j=0;j<n;j++){
        if(a[j]<=i){
      dp[i] += dp[i-a[j]];
    }
}
}
System.out.println(dp[tar]);
}}