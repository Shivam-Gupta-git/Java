package JAVA_PROGRAMS.Topics.Sorting_Algorithm_14;

public class Insertion_sort_3 {
    public static void insertionSort(int[] num){
        for (int i = 1; i < num.length; i++){
           int current = num[i];
           int prev = i - 1;
           while (prev >= 0 && num[prev] > current){
               num[prev + 1] = num[prev];
               prev --;
           }
           num[prev + 1] = current;
        }
    }

    public static void printArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 3, 2};
        insertionSort(numbers);
        printArr(numbers);
    }
}
