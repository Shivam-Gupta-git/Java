package JAVA_PROGRAMS.Topics.Array_12;

public class Reverse_Number_6 {
    public static void reverseNum (int[] num){
        int first = 0, last = num.length - 1;
        while (first < last){

            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 12, 32, 11, 5, 14, 20};
        reverseNum(numbers);

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

    }
}
