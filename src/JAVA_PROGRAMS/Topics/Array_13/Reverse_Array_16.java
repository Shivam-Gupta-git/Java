package JAVA_PROGRAMS.Topics.Array_13;

public class Reverse_Array_16 {
    public static void reverseNum(int[] num){
        int[] reverse = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--){
            reverse[num.length - i - 1] = num[i];
        }
        System.out.print("Reverse Array is: ");
        for (int i = 0; i < reverse.length; i++){
            System.out.print(reverse[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseNum(numbers);
    }
}
