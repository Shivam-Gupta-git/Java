package JAVA_PROGRAMS.Topics.String_16;

public class String_1 {
    public static void main(String[] args) {

        char[] char1 = {'a', 'b', 'c', 'd'};
        String str1 = "Mohan";
        String str2 = new String("Mohan");

// ->   concatenate...........
//        String firstName = "Mohan";
//        String lastName = "Sharma";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

// -> charAt method...........
        String name = "Mohan Sharma";
        System.out.println(name.charAt(1));
    }
}