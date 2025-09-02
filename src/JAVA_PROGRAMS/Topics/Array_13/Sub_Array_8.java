package JAVA_PROGRAMS.Topics.Array_13;

public class Sub_Array_8 {
    public static void subArray(int[] num){
        int totalSubArray = 0;
        for (int i = 0; i < num.length; i++){
            int start = i;
            for (int j = i; j < num.length; j++){
              int end = j;
              for (int k = start; k <= end; k++){
                  System.out.print(num[k] + " ");
              }
              totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sunArray is: " + totalSubArray);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        subArray(numbers);
    }
}
