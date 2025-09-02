package JAVA_PROGRAMS.Topics.Function_11;

public class Binary_to_decimal_10 {
// -> Convert from binary to decimal
    public static void binary(int num){
     int myNum = num;
     int pow = 0;
     int decimalNum = 0;
     while (num > 0){
         int lastNum = num % 10;
         decimalNum = decimalNum + (int) (lastNum * Math.pow(2, pow));
         pow ++;
         num /= 10;
     }
        System.out.println("decimal of " + myNum + " = " + decimalNum);
    }
    public static void main(String[] args) {
        binary(1010101);
    }
}
