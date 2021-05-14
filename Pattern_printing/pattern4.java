import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("\t");
            }
            for(int k=i;k>0;k--){
                System.out.print("*" +"\t");
            }
            System.out.println("");
        }
    
    }
}