package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class Clear_last_ith_bit_7 {
    public static int clearLatIthBit(int num, int i){
        int bitMass = ((-1) << i);
        return  num & bitMass;
    }
    public static void main(String[] args) {
        System.out.println(clearLatIthBit(15, 2));
    }
}
