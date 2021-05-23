import java.util.*;

public class painthousemanypaint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h=s.nextInt();
        int p=s.nextInt();
        int[][] a=new int[h][p];
        for(int i=0;i<h;i++){
            for(int j=0;j<p;j++){
                a[i][j]=s.nextInt();
            }
        }
        int[][] dp =new int[h][p];
        int least=Integer.MAX_VALUE;
        int sleast=Integer.MAX_VALUE;
        for(int i=0;i<p;i++){
            dp[0][i]=a[0][i];
            if(a[0][i]<=least){
                sleast=least;
                least=a[0][i];
            }
            else if(a[0][i]<=sleast){
                sleast=a[0][i];
            }
        }
        
        for(int i=1;i<h;i++){
            int nleast=Integer.MAX_VALUE;
            int nsleast=Integer.MAX_VALUE;
            for(int j=0;j<p;j++){
                if(dp[i-1][j]==least){
                    dp[i][j]=sleast+a[i][j];
                }
                else{
                    dp[i][j]=least+a[i][j];
                }
                if(dp[i][j]<=nleast){
                    nsleast=nleast;
                    nleast=dp[i][j];
                }
                else if(dp[i][j]<=nsleast){
                    nsleast=dp[i][j];
                }
            }
            least=nleast;
            sleast=nsleast;
        }
    System.out.println(least);
    }
}
        