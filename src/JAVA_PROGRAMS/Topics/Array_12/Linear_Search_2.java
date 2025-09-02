package JAVA_PROGRAMS.Topics.Array_12;

public class Linear_Search_2 {
    public static int LinearSearch(int[] num, int key){
        for (int i = 0; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 3, 7, 9, 11, 32, 12, 55, 33, 20};
        int key = 55;

        int CheckVal = LinearSearch(numbers, key);
        if(CheckVal == -1){
            System.out.println("Key value not found at any index");
        }else {
            System.out.println("Key value is at " + CheckVal + " index");
        }
    }
}
