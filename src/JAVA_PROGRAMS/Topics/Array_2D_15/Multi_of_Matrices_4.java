package JAVA_PROGRAMS.Topics.Array_2D_15;

import java.util.Scanner;

public class Multi_of_Matrices_4 {

//  Print values...........
    public static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//  Multiply................
    public static void multi(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2 ){
            System.out.println("Wrong Input");
            return;
        }
        int[][] multi = new int[r1][c2];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < c1; k++){
                    multi[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of matrix one and two is: ");
        printmatrix(multi);
    }
//  Take input...............
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of first row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of first column: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter first matrices " + (r1 * c1) + " elements");
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of second row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of second column: ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter second matrices " + (r2 * c2) + " elements");
        for (int i = 0; i < r2; i++){
            for (int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printmatrix(arr1);
        System.out.println("Matrix 2");
        printmatrix(arr2);
        multi(arr1, r1, c1, arr2, r2, c2);
    }
}
