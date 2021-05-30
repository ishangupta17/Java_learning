import java.util.Scanner;

public class buysellstockcool {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int[] a =new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int bsp=-a[0];
    int ssp=0;
    int cooldown=0;
    for(int i=1;i<n;i++){
        int nssp=0;
        int nbsp=0;
        int ncooldown=0;
        if(cooldown -a[i]>bsp){
            nbsp=cooldown-a[i];
        }
        else{
            nbsp=bsp;
        }
        if(bsp+a[i]>ssp){
            nssp=bsp+a[i];
        }
        else{
            nssp=ssp;
        }
        if(ssp>cooldown){
            ncooldown=ssp;
        }
        else{
            ncooldown=cooldown;
        }
        bsp=nbsp;
        ssp=nssp;
        cooldown=ncooldown;
    }
    System.out.println(ssp);
}    
}
