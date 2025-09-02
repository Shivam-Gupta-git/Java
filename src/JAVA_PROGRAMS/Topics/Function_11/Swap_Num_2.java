package JAVA_PROGRAMS.Topics.Function_11;

public class Swap_Num_2 {

    //  -> Call by Value.(1st part)
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
    }
}
