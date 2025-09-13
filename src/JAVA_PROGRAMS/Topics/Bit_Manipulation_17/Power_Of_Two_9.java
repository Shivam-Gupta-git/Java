package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class Power_Of_Two_9 {
    public static boolean powerOf2(int num){
        if((num & (num - 1)) == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(powerOf2(16));
    }
}
