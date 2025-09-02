package JAVA_PROGRAMS.Topics.Function_11;

public class Function_Overloading_6 {
// -> Function Overloading (using parameters)
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println(sum(12, 23));
        System.out.println(sum(12, 43, 56));
    }
}
