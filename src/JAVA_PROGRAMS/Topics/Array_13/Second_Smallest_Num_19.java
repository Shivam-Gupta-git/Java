package JAVA_PROGRAMS.Topics.Array_13;

public class Second_Smallest_Num_19 {
    public static void secondSmallestNum(int[] num){
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++){
            if(num[i] < smallestNum){
                secondSmallestNum = smallestNum;
                smallestNum = num[i];
            } else if (num[i] < secondSmallestNum && num[i] != smallestNum) {
                secondSmallestNum = num[i];
            }
        }
        System.out.println("Second Smallest Number is " + secondSmallestNum);
    }
    public static void main(String[] args) {
        int[] numbers = {55, 44, 31, 55};
        secondSmallestNum(numbers);
    }
}
