import java.util.*;
public class inverse{
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int temp=n;
    int ne=0;
    int count=0;
    while(temp!=0){
        int r=temp%10;
        temp=temp/10;
        count++;
        ne=ne+(count*Math.pow(10,r-1));
    }}
}