import java.util.*;
public class climbstair{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    System.out.println(ways(n));    
    } 

    public static int ways(int n ){
    int [] arr = new int[n+1];
    arr[n]=1;
         for(int i=n-1;i>=0;i--){
             if(i==n-1){
             arr[i]=arr[n];
             }
             else if(i==n-2){
            arr[i]=arr[n]+ arr[n-1];
             }
             else{
          arr[i] = arr[i+1] + arr[i+2] + arr[i+3];
             }

        }
        return arr[0];
    }
}