import java.util.*;
public class countbinarystring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a =new int[2][n+1];
        a[0][1]=1;
        a[1][1]=1;
        for(int i =2;i<=n;i++){
        a[0][i]=a[1][i-1];
        a[1][i]=a[0][i-1]+a[1][i-1];
        }
        System.out.print(a[0][n]+a[1][n]);
    }
}