package JAVA_PROGRAMS.Topics.Array_13;

public class Sum_and_Avg_12 {
    public static void sumAndAvg(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        int avg = sum/num.length;
        System.out.println("Average of given array is: " + avg);
    }
    public static void main(String[] args) {
        int [] numbers = {1, 3, 5, 11, 16};
        sumAndAvg(numbers);
    }
}
