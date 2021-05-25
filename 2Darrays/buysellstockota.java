import java.util.*;
public class buysellstockota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int profit=Integer.MIN_VALUE;
        int bp=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<bp){
                bp=a[i];
            }
            int diff=a[i]-bp;
            if(diff>profit){
                profit=diff;
            }
        }
        System.out.print(profit);
    }
}