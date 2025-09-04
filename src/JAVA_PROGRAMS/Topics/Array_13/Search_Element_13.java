package JAVA_PROGRAMS.Topics.Array_13;

public class Search_Element_13 {
// -> Write a program to search an element in an array (linear search).
    public static void searchElement(int[] num, int compNum){
        boolean isFound = false;
        for (int i = 0; i < num.length; i++){
            if(num[i] == compNum){
                System.out.println("Your number placed on " + i + " index in an given array");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Your number can't be Present in an array");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 7, 11};
        int compNum = 7;
        searchElement(numbers, compNum);
    }
}
