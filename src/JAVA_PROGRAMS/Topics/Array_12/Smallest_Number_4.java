package JAVA_PROGRAMS.Topics.Array_12;
import java.util.*;

public class Smallest_Number_4 {
    public static int smallestNum(int[] num) {
        int compNum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
          if(num[i] < compNum){
              compNum = num[i];
          }
        }
        return compNum;
    }

    public static void main(String[] args) {
        int[] numbers = {33, 44, 11, 13, 23, 33, 41, 50, 34, 55, 12};
        int smallestNumber = smallestNum(numbers);
        System.out.println(smallestNumber + " is a smallest number of an array");
    }
}
