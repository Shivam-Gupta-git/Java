package JAVA_PROGRAMS.Topics.Function_11;

public class Prime_Or_Not_8 {
// -> check if a number is prime or not
    public static boolean primeNum(int num){
        boolean isPrime = true;
        if(num == 2){
           isPrime = true;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(primeNum(7));
    }
}
