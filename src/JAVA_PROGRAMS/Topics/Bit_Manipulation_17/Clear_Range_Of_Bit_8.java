package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class Clear_Range_Of_Bit_8 {
    public static int clearRangeOfBit(int num, int i, int j){
        int a = ((-1) << (j + 1));
        int b = (1 << i) - 1;
        int bitMass = a | b;
        return num & bitMass;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBit(10, 2, 3));
    }
}
