package JAVA_PROGRAMS.Topics.Array_13;

public class Rotate_Right_Element_25 {

    public static void rotateRightElement(int[] num) {
        int last = num[num.length - 1];
        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = last;
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        rotateRightElement(number);
    }
}
