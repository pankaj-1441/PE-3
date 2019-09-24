package co.exercise3;

import java.util.Scanner;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter no. of rows : ");
            int row = sc.nextInt();
            if (row < 0) {
                throw new Exception("Rows of a matrix cannot be < 0");
            }
            System.out.print("Enter no. of columns : ");
            int col = sc.nextInt();
            if (row < 0) {
                throw new Exception("Columns of a matrix cannot be < 0");
            }

        int[][] first=new int[row][col];
        int[][] second=new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("first["+i+"]["+j+"] : ");
                first[i][j]=sc.nextInt();

            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("second["+i+"]["+j+"] : ");
                second[i][j]=sc.nextInt();

            }
        }
          int[][] sum=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
             sum[i][j]=first[i][j]+second[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(sum[i][j] +"  ");

            }
            System.out.println();
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
