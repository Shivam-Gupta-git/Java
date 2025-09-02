package JAVA_PROGRAMS.Topics.Function_11;

public class Function_Overloading_7 {
// -> Function Overloading (using data type)
    public static float sum(float num1, float num2){
        return num1 + num2;
    }
    public static float sum(float num1, float num2, float num3){
       return  num1 + num2 + num3;
    }
    public static double sum(double num1, double num2){
        return  num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(sum(12.55f, 32.0f));
        System.out.println(sum(12.54f, 22.54f, 12.65f));
        System.out.println(sum(123456, 3214));
    }
}
