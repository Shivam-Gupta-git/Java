package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class get_ith_bit_3 {
    public static int getIthBit(int num, int i){
        int bitMask = 1 << i;
        if((num & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
    }
}
