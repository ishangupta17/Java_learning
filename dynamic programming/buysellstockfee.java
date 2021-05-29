import java.util.*;
public class buysellstockfee {
    public static void main(String[] args) {
        
    
    Scanner s =new Scanner(System.in);
    int n=s.nextInt();
    int[] a =new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int fee=s.nextInt();
    int bsp=-a[0];
    int ssp=0;
    for(int i=1;i<n;i++){
        int nssp=0;
        int nbsp=0;
        if(ssp-a[i]>bsp){
            nbsp=ssp-a[i];
        }
        else{
            nbsp=bsp;
        }
        if(bsp+a[i]-fee>ssp){
            nssp=bsp+a[i]-fee;
        }
        else{
            nssp=ssp;
        }
        bsp=nbsp;
        ssp=nssp;
    }
    System.out.println(ssp);
    }
}
