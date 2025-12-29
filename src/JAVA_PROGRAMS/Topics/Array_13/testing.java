package JAVA_PROGRAMS.Topics.Array_13;

public class testing {
    public static int test(int[] num){
        int st = 0;
        System.out.println(st);
        int end = num.length - 1;
        System.out.println(end);
        int middle;
        middle = (st + end) / 2;
        System.out.println(middle);
        return  middle;
    }

    public static void main(String[] args) {
        int[] number = {2, 4};
        int testing = test(number);
        System.out.println(testing);
    }
}
