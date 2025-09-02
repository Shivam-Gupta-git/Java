package JAVA_PROGRAMS.Topics.Function_11;

public class Function_declaration_1 {
// -> Function with return value.(1st part)
    public static void PrintHelloWorld() {
        System.out.println("Hello World");
        return;
    }

// -> Function with Parameter.(1st part)
    public  static int SumOfDigit(int num1, int num2){ // num1 and num2 is a parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        PrintHelloWorld();
        int sum = SumOfDigit(2, 5);
        System.out.println("Sum of the number is: " + sum);
    }
}
