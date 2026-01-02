package JAVA_PROGRAMS.Topics.Array_13;
import java.util.Arrays;

public class Rearrange {
    public static void test(int[] num){
        int[] positiveArray = new int[num.length];
        int[] negativeArray = new int[num.length];
        int[] sortedArray = new int[num.length];

        int positive = 0, negative = 0, sorted = 0;

        // Step 1: Separate positives and negatives
        for(int i = 0; i < num.length; i++){
            if (num[i] >= 0){
                positiveArray[positive++] = num[i];
            } else {
                negativeArray[negative++] = num[i];
            }
        }

        System.out.println("Positives: " + Arrays.toString(Arrays.copyOf(positiveArray, positive)));
        System.out.println("Negatives: " + Arrays.toString(Arrays.copyOf(negativeArray, negative)));

        // Step 2: Merge alternately
        int i = 0, j = 0;
        while (i < positive && j < negative){
            // Alternate: positive then negative
            sortedArray[sorted ++] = positiveArray[i++];
            sortedArray[sorted ++] = negativeArray[j++];
        }

        // Step 3: Add remaining elements (if any)
        while (i < positive){
            sortedArray[sorted ++] = positiveArray[i++];
        }
        while (j < negative){
            sortedArray[sorted ++] = negativeArray[j++];
        }

        System.out.println("Alternating Array: " + Arrays.toString(Arrays.copyOf(sortedArray, sorted)));
    }

    public static void main(String[] args) {
        int[] number = {1, -2, 3, -5, 4, 9, 2};
        test(number);
    }
}
