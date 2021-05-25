import java.io.*;
import java.util.*;

public class paintfence{

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        long same =k;
        long diff=k*(k-1);
        long total=same + diff;
        for(int i=3;i<=n;i++){
            same=diff;
            diff=total*(k-1);
            total=same+diff;
        }
        System.out.print(total);
    }
}