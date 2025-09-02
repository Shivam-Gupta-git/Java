package JAVA_PROGRAMS.Topics.Array_12;

public class Max_Subarray_Sum_9 {
    public static void maxSubarray(int[] num){
        for (int i = 0; i < num.length; i++){
            for (int j = i; j < num.length; j++){
                int sum = 0;
                for (int k = i; k <= j; k++){
                    System.out.print(num[k] + " " );
                    sum += num[k];
                }
                System.out.println(" => sum: " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        maxSubarray(numbers);
    }
}
