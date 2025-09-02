package JAVA_PROGRAMS.Topics.Function_11;

public class Prime_In_Range_9 {
// -> Print all Prime in a range
    public static boolean primeNum(int num){
        boolean isPrime = true;
        if(num == 2){
            isPrime = true;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }
    public static void primeRange(int num){
        for (int i = 1; i <= num; i++){
            if(primeNum(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeRange(10);
    }
}
