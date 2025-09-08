package JAVA_PROGRAMS.Topics.String_16;

public class Comparison {
    public static void main(String[] args) {
        String s1 = "Mohan";
        String s2 = "Mohan";
        String s3 = new String("Mohan");

        if (s1 == s2) {
            System.out.println("s1 and s2 String is equal");
        }else {
            System.out.println("s1 and s2 String is not equal");
        }

        if(s1 == s3){
            System.out.println("s1 and s3 String is equal");
        }else {
            System.out.println("s1 and s3 String is not equal");
        }

//      == can't comp two string correctly that why we are used .equals()
        if(s1.equals(s3)){
            System.out.println("s1 and s3 String is equal");
        }else {
            System.out.println("s1 and s3 String is not equal");
        }

    }
}
