import java.util.*;
public class unboundknapsack {
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
           int dp[]=new int[cap+1];
           int max=0;
           for(int j=1;j<dp.length;j++){
            for(int i=0;i<n;i++){
            
                if(j>=w[i]){

                 if (max<v[i]+dp[j-w[i]]){
                     max=v[i]+dp[j-w[i]];
                 }
              }
            }
            dp[j]=max; 
            }
           System.out.print(dp[cap]);
    }
}
