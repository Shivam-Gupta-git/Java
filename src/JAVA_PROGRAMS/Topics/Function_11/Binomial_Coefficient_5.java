package JAVA_PROGRAMS.Topics.Function_11;

public class Binomial_Coefficient_5 {
// -> Find the Binomial Coefficient.(1st part)
//    n!/r!(n - r)! (formula)

     public static int calculateFactorial (int n){
      int fact = 1;
      for (int i = 1; i <= n; i++){
          fact *= i;
      }
      return fact;
     }
     public static int calculateBinomialCoff (int n, int r){
         int factOfN = calculateFactorial(n);
         int factOfR = calculateFactorial(r);
         int factOfNR = calculateFactorial(n - r);
         int binomialCoff = factOfN / (factOfR * factOfNR);
         return binomialCoff;
     }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int binomialCaff = calculateBinomialCoff(n, r);
        System.out.println("Binomial Coefficient is: " + binomialCaff);
    }
}
