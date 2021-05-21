import java.util.*;
public class building{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long oldspace=1;
        long oldbuild=1;
        
        for(int i =2;i<=n;i++){
        long newspace=oldspace+oldbuild;
        long newbuild=oldspace;
        oldspace=newspace;
        oldbuild=newbuild;
        }
        long sum=oldspace+oldbuild;
        System.out.print(sum*sum);
    }
}