import java.io.*;
import java.util.*;

public class nqueen {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int maze[][]=new int[n][n];
        printNQueens(maze, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
         System.out.println(qsf + ".");
            return;
        }
        for(int colno =0;colno<chess.length;colno++){
            if(issafe(chess,row,colno)==true){
        chess[row][colno]=1;
        printNQueens(chess, qsf+row+"-"+colno+",", row+1);
        chess[row][colno]=0;
        }}
    }
    public static boolean issafe(int[][] chess,int row,int colno){
        for(int i =row-1,j=colno-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
            return false;}
        }
        for(int i =row-1,j=colno;i>=0;i--){
            
            if(chess[i][j]==1){return false;}
        }
        for(int i =row-1,j=colno+1;i >=0&& j<chess.length;i--,j++){
            if(chess[i][j]==1){return false;}
        }
        return true;
     
    }
   
}