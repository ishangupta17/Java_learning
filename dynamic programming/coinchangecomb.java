import java.util.*;
public class coinchangecomb{
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
for(int i=0;i<n;i++){
    for(int j=a[i];j<dp.length;j++){
    dp[j] += dp[j-a[i]];
    }
}
System.out.print(dp[tar]);
}
}