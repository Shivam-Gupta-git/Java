package JAVA_PROGRAMS.Topics.Array_2D_15;

import java.util.Scanner;

public class Sum_of_Matrices {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrix one and two is: ");
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of first rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of first columns: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter first matrices " + (r1 * c1) + " elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of second rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of second columns: ");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter second matrices " + (r2 * c2) + " elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        add(a, r1, c1, b, r2, c2);
    }

}
