package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;

public class K_rotation_26 {
    public static void kRotation(int[] num) {
        int position = 2;

        int first = num[position];
        for (int i = position; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = first;
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        kRotation(number);

    }
}
