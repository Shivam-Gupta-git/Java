package JAVA_PROGRAMS.Topics.Array_13;

public class Sorting_in_Ascending_Order_20 {
    public static boolean ascending(int[] num){
        for (int i = 0; i < num.length - 1; i++){
            if(num[i] > num[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean result = ascending(numbers);
        if(!result){
            System.out.println("array 1 is not sorted in ascending order");
        }else {
            System.out.println("array 1 is sorted in ascending order");
        }
    }
}
