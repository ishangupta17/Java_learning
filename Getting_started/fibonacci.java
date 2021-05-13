import java.util.*;
  
class Main{
  
  public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
      int n =s.nextInt();
      int count=1;
      int a=0,b=1;
      System.out.println(a);
      System.out.println(b);
      int sum;
      while(count<=n-2){
       sum=a+b;
       System.out.println(sum);
       a=b;
       b=sum;
        count++;
      }
   }
  }