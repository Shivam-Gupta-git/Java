package JAVA_PROGRAMS.Topics;

import java.util.Scanner;

public class function_11 {

// -> Function with return value.(1st part)
//    public static void PrintHelloWorld() {
//        System.out.println("Hello World");
//        return;
//    }

// -> Function with Parameter.(1st part)
//    public  static int SumOfDigit(int num1, int num2){ // num1 and num2 is a parameters
//        int sum = num1 + num2;
//        return sum;
//    }

//  -> Call by Value.(1st part)
//     public static void swap (int num1, int num2){
//         int temp = num1;
//         num1 = num2;
//         num2 = temp;
//     }

//  -> Find Product of a and b.(1st part)
//    public static int calculateProduct (int num1, int num2){
//        int product = num1 * num2;
//        return product;
//    }

//  -> Find factorial of n number.(1st part)
//    public static int calculateFactorial (int num){
//        int fact = 1;
//        for (int i = 1; i <= num; i++){
//            fact *= i;
//        }
//        return fact;
//    }

//  -> Find the Binomial Coefficient.(1st part)
//    n!/r!(n - r)! (formula)
/*
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
*/

/*  -> Function Overloading (using parameters)
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
*/

/*  -> Function Overloading (using data type)
    public static float sum(float num1, float num2){
        return num1 + num2;
    }
    public static float sum(float num1, float num2, float num3){
       return  num1 + num2 + num3;
    }
    public static double sum(double num1, double num2){
        return  num1 + num2;
    }
*/

//  -> check if a number is prime or not
//    public static boolean primeNum(int num){
//        boolean isPrime = true;
//        if(num == 2){
//           isPrime = true;
//        }else {
//            for (int i = 2; i <= Math.sqrt(num); i++){
//                if(num % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        return isPrime;
//    }

//  -> Print all Prime in a range
//    public static boolean primeNum(int num){
//        boolean isPrime = true;
//        if(num == 2){
//            isPrime = true;
//        }else {
//            for (int i = 2; i <= Math.sqrt(num); i++){
//                if(num % i == 0){
//                    isPrime = false;
//                }
//            }
//        }
//        return isPrime;
//    }
//    public static void primeRange(int num){
//        for (int i = 1; i <= num; i++){
//            if(primeNum(i)){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }


//  -> Convert from binary to decimal
//    public static void binary(int num){
//     int myNum = num;
//     int pow = 0;
//     int decimalNum = 0;
//     while (num > 0){
//         int lastNum = num % 10;
//         decimalNum = decimalNum + (int) (lastNum * Math.pow(2, pow));
//         pow ++;
//         num /= 10;
//     }
//        System.out.println("decimal of " + myNum + " = " + decimalNum);
//    }

//  -> Convert from decimal to binary
       public static void decimal(int num){
           int myNum = num;
           int pow = 0;
           int binaryNum = 0;
           while (num > 0){
               int lastNum = num % 2;
               binaryNum = binaryNum + (int) (lastNum * Math.pow(10, pow));
               pow ++;
               num /= 2;
           }
           System.out.println("binary of " + myNum + " = " + binaryNum);
       }


public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);

//  -> Function with return value.(2nd part)
//      PrintHelloWorld();

//  -> Function with Parameter.(2nd part)
//        System.out.println("Please Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Please Enter the second number");
//        int b = sc.nextInt();
//        int sum =  SumOfDigit(a , b); // a and b is actual parameters
//        System.out.println("Your Sum of "+ a + " + " + b + " is "+ sum);

//  -> Call by Value.(2nd part)
//        int a = 10;
//        int b = 20;
//        swap(a, b);
//        System.out.println(a);
//        System.out.println(b);

//  -> Find Product of a and b.(2nd part)
//        System.out.println("Please Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.println("Please Enter the second number: ");
//        int b = sc.nextInt();
//        int product = calculateProduct(a, b);
//        System.out.println("Production of " + a + " and " + b + " is: " + product);

//  -> Find factorial of n number.(2nd part)
//        System.out.println("Enter your number: ");
//        int num = sc.nextInt();
//        int factNumber = calculateFactorial(num);
//        System.out.println("Factorial of " + num + " is: " + factNumber);

/*  -> Find the Binomial Coefficient.(2nd part)
      int n = 5;
      int r = 2;
      int binomialCaff = calculateBinomialCoff(n, r);
      System.out.println("Binomial Coefficient is: " + binomialCaff);
*/

/*  -> Function Overloading(using parameters)
       System.out.println(sum(12, 23));
       System.out.println(sum(12, 43, 56));
*/

/*  -> Function Overloading(using data type)
        System.out.println(sum(12.55f, 32.0f));
        System.out.println(sum(12.54f, 22.54f, 12.65f));
        System.out.println(sum(123456, 3214));
*/

//  -> check if a number is prime or not
//    System.out.println(primeNum(7));

//  -> Print all Prime in a range
//     primeRange(10);

//  -> Convert from binary to decimal
//     binary(1010101);

//  -> Convert from decimal to binary
       decimal(5);
}
}

