package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class Set_ith_bit_4 {
    public static int setIthBit(int num, int i){
        int bitMass = 1 << i;
        return num | bitMass;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
