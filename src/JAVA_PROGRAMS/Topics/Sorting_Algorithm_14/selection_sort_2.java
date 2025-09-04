package JAVA_PROGRAMS.Topics.Sorting_Algorithm_14;

public class selection_sort_2 {
    public static void selectionSort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int currentElem = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[currentElem] > num[j]) {
                    currentElem = j;
                }
            }
            int temp = num[currentElem];
            num[currentElem] = num[i];
            num[i] = temp;
        }
    }

    public static void printArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 7, 3, 9};
        selectionSort(numbers);
        printArr(numbers);
    }
}
