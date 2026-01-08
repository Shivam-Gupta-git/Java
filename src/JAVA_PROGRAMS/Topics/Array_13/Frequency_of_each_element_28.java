package JAVA_PROGRAMS.Topics.Array_13;

public class Frequency_of_each_element_28 {
    public static void findFrequency(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if(num[i] == -1) continue;
            int count = 1;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                    num[j] = -1;
                }
            }
            System.out.println(num[i] + " = " + count);
        }
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 2, 3, 4, 1, 5};
        findFrequency(number);
    }
}
