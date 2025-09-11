package JAVA_PROGRAMS.Topics.String_16;

public class String_Compression_11 {
    public static String stringCompress(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            newString += str.charAt(i);
             if(count > 1){
                 newString += count.toString();
             }
        }
        return  newString;
    }
    public static void main(String[] args) {
        String str = "aaaabbbcdeee";
        System.out.println(stringCompress(str));
    }
}
