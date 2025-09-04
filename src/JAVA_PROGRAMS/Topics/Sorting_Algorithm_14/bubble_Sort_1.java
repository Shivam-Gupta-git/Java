package JAVA_PROGRAMS.Topics.Sorting_Algorithm_14;

public class bubble_Sort_1 {
    //  Bubble sort..........
    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 1, 7, 9};
        bubbleSort(numbers);
        System.out.println(numbers.length);
        printArr(numbers);
    }
}
