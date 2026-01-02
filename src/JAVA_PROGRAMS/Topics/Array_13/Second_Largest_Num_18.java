package JAVA_PROGRAMS.Topics.Array_13;

public class Second_Largest_Num_18 {
    public static void secondLargest(int[] num){
        if(num.length < 2){
            System.out.println("Array must have at least two elements");
            return;
        }

        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;


        for (int i = 0; i < num.length; i++){
            if(num[i] > largestNum){
                secondLargestNum = largestNum;
                largestNum = num[i];


            } else if (num[i] > secondLargestNum && num[i] != largestNum) {
                secondLargestNum = num[i];

              }
        }
        if(secondLargestNum == Integer.MIN_VALUE){
            System.out.println("All elements are same");
        }else {
            System.out.println("Second largest number is: " + secondLargestNum);
        }

    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        secondLargest(numbers);
    }
}
