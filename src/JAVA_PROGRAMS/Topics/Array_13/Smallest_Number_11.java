package JAVA_PROGRAMS.Topics.Array_13;

public class Smallest_Number_11 {
    public static void smallestNum(int[] num){
        int compNum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
            if(num[i] < compNum){
                compNum = num[i];
            }
        }
        System.out.println("Smallest Number is: " + compNum);
    }

    public static void main(String[] args) {
        int[] numbers = {25, 5, 7, 11, 15, 21, 34, 33};
        smallestNum(numbers);
    }
}
