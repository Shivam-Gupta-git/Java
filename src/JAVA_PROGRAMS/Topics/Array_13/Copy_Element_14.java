package JAVA_PROGRAMS.Topics.Array_13;

public class Copy_Element_14 {
// -> Write a program to copy all elements from one array to another.

    public static void copyElement(int[] num){
        int[] copyArray = new int[num.length];
        for (int i = 0; i < num.length; i++){
         copyArray[i] = num[i];
        }
        System.out.print("Copy array is: ");
        for (int i = 0; i < copyArray.length; i++){
            System.out.print(copyArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 7, 11, 23};
        copyElement(numbers);
    }
}
