import java.util.*;
  
  public class Triplet{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner s = new Scanner(System.in);
    int a =s.nextInt();
    int b =s.nextInt();
    int c =s.nextInt();
    int max;
    if(a>b && a>c){
        max=a;
        boolean flag = (max*max== (b*b) + (c*c));
        System.out.println(flag);
    }
    else if(b>a && b>c){
        max=b;
        boolean flag = (max*max== (a*a) + (c*c));
        System.out.println(flag);
    }
    else{
        max =c;
        boolean flag = (max*max== (a*a) + (b*b));
        System.out.println(flag);
    }
   }
  }