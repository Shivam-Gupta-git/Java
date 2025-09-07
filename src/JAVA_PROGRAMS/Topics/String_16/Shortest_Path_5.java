package JAVA_PROGRAMS.Topics.String_16;

public class Shortest_Path_5 {
    public static float shortestPath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++){
            char digit = path.charAt(i);
            if(digit == 'N'){
                y++;
            } else if (digit == 'E') {
                x++;
            } else if (digit == 'S') {
                y--;
            } else if (digit == 'W') {
                x--;
            }
        }
        int squareOfX = x * x;
        int squareOfY = y * y;

        return (float) Math.sqrt(squareOfX + squareOfY);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
