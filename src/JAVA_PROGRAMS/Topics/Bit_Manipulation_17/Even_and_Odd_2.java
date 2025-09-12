package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class Even_and_Odd_2 {
    public static void evenOdd(int num){
        int compValue = ((num & 1));
        if(compValue == 0){
            System.out.println(num + " is a even number");
        }else {
            System.out.println(num + " is a odd number");
        }
    }
    public static void main(String[] args) {
        evenOdd(10);
        evenOdd(11);
        evenOdd(5);
    }
}
