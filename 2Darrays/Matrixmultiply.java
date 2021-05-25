import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner  s =new Scanner(System.in);
    
    int n1=s.nextInt();
    int m1=s.nextInt();
    int[][] a1 =new int[n1][m1];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            a1[i][j]=s.nextInt();
        }
    }
    int n2=s.nextInt();
    int m2=s.nextInt();
    int[][] a2 =new int[n2][m2];
    
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            a2[i][j]=s.nextInt();
        }
    }
 if(m1==n2){
     int prd[][]=new int[n1][m2];
     for(int i=0;i<n1;i++){
         for(int j=0;j<m2;j++){
             for(int k=0;k<n2;k++){
         prd[i][j]+=a1[i][k]*a2[k][j];
         }
        }
     }
     
     for(int i=0;i<prd.length;i++){
    for(int j=0;j<prd[0].length;j++){
        System.out.print(prd[i][j]+" ");
    }
    System.out.println();
   }

 }
 
 else{
     System.out.println("Invalid input");
 }
 
}
}