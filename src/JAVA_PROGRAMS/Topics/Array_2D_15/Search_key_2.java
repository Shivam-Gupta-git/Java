package JAVA_PROGRAMS.Topics.Array_2D_15;

import java.util.Scanner;

public class Search_key_2 {

    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchKey(int[][] arr, int key){
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == key){
                    System.out.println("Element " + key + " found at cell (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("Element " + key + " not found in the matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter " + (r*c) + " elements:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix is:");
        printMatrix(arr);

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        searchKey(arr, key);
    }
}