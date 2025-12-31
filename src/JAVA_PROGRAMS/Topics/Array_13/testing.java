package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;

public class testing {
    public static boolean test(int[] num){
        for (int i = 0; i < num.length; i++){
           for (int j = 1 + i; j < num.length; j++){
               if(num[i] > num[j]){
                  return false;
               }
           }
        }
        return  true;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 5, 4};
        boolean result = test(number);
        if(!result){
            System.out.println("isSorting not");
        }else {
            System.out.println("isSorting");
        }

    }
}
