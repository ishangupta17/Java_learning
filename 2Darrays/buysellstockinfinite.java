
import java.util.*;
public class buysellstockinfinite {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int bd=0,sd=0;
        int netprofit=0;
        for(int i=1;i<n;i++){
                if(a[i]>=a[i-1]){
                    sd++;
                }
                else{
                    netprofit +=a[sd]-a[bd];
                    bd=sd=i;      
                }
        }
            netprofit+=a[sd]-a[bd];
            
        
        System.out.println(netprofit);
    }    
}
