package JAVA_PROGRAMS.Topics.Array_2D_15;

import java.util.Scanner;
public class Creation_Of_2D_Array_1 {
    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int r = sc.nextInt();
        System.out.print("Enter numbers of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter " + r*c + " element");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArr(arr);
    }
}
