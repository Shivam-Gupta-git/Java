package JAVA_PROGRAMS.Topics.Array_13;

public class Pairs_7 {
    public static void pairOFNumber(int[] num) {
        int totalPair = 0;

        for (int i = 0; i < num.length; i++) {   // fixed loop
            int current = num[i];
            for (int j = i + 1; j < num.length; j++) {
               int sum = num[i] + num[j];
                System.out.print(" (" + current + "," + num[j] + ") "+ "Sum " + "= " + sum );
                totalPair++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs: " + totalPair);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 5, 4, 6};
        pairOFNumber(numbers);
    }
}