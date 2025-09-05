package JAVA_PROGRAMS.Topics.Array_2D_15;

import java.util.Scanner;

public class Multi_of_Matrices {

//  Multiply................
    public static void multi(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2 ){
            System.out.println("Wrong Input");
            return;
        }
        int[][] multi = new int[r1][c1];

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
    }
}
