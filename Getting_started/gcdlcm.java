import java.util.*;
    
    public class gcdlcm{
    
    public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int rem;
      int tn1=n1;
      int tn2=n2;
      while (n2%n1!=0){
      rem=n2%n1;
      n2=n1;
      n1=rem;
      }
      int gcd = n1;
      System.out.println(gcd);
      int lcm = (tn1*tn2)/gcd;
      System.out.print(lcm);
     }
    }