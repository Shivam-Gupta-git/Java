package JAVA_PROGRAMS.Topics.Array_12;
import java.util.*;

public class Largest_Number_3 {
    public static int largestNum(int[] num){
        int compNum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++){
           if(num[i] > compNum){
               compNum = num[i];
           }
        }
        return compNum;
    }
    public static void main(String[] args) {
        int[] number = {33, 44, 11, 13, 23, 33, 41, 50, 34, 55, 12};
        int largestNumber = largestNum(number);
        System.out.println(largestNumber + " is a largest number of an array");
    }
}
