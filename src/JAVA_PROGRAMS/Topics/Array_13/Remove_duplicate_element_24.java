package JAVA_PROGRAMS.Topics.Array_13;

public class Remove_duplicate_element_24 {
    public static void removeDuplicateElement(int[] num){

        for (int i = 0; i < num.length; i++){
            for (int j = 1 + i; j < num.length; j++){
                if(num[i] == num[j]){
                    num[j] = -1;
                }
            }
        }
        for (int i = 0; i < num.length; i++){
            if(num[i] != -1){
                System.out.println(num[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {1, 3, 4, 4, 5};
        removeDuplicateElement(number);
    }
}
