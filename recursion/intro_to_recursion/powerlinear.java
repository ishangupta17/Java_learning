import java.io.*;
import java.util.*;

public class powerlinear{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s =new Scanner(System.in);
        int xi =s.nextInt();
        int ni =s.nextInt();
        System.out.print(power(xi,ni));
    }

    public static int power(int x, int n){
        if(n>0){
            x=x*power(x,n-1);
            return x;
        }
        else{
            return 1;
        }
    }

}