package JAVA_PROGRAMS.Topics.Bit_Manipulation_17;

public class update_ith_bit_6 {
    public static int updateIthBit(int num, int i, int newBit){
      if(newBit == 0){
//    Clear ith bit
          int bitMass = ~(i << 1);
          return num & bitMass;
      }else {
//    Set ith bit
          int bitMass = i << 1;
          return num | bitMass;
      }
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
