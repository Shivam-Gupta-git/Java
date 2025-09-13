package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class Clear_ith_bit_5 {
    public static int clearIthBit(int num, int i){
        int bitMass = ~(i << 1);
        return num & bitMass;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}
