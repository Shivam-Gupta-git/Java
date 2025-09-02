package JAVA_PROGRAMS.Topics.Function_11;

public class Decimal_to_binary_11 {
// -> Convert from decimal to binary
       public static void decimal(int num){
           int myNum = num;
           int pow = 0;
           int binaryNum = 0;
           while (num > 0){
               int lastNum = num % 2;
               binaryNum = binaryNum + (int) (lastNum * Math.pow(10, pow));
               pow ++;
               num /= 2;
           }
           System.out.println("binary of " + myNum + " = " + binaryNum);
       }
    public static void main(String[] args) {
        decimal(5);
    }
}
