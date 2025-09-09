package JAVA_PROGRAMS.Topics.String_16;

public class String_Builder_9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
// time complexity = o(26)