package JAVA_PROGRAMS.Topics.Array_13;

public class Ascending_Order_21 {
    public static void ascending(int[] num){
        for (int i = 0; i < num.length - 1; i++){
            for (int j = 0; j < num.length - i - 1; j++){
                if(num[j] > num[j + 1]){
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
        int[] numbers = {2, 4, 1, 6};
        ascending(numbers);
        printArr(numbers);
    }
}
