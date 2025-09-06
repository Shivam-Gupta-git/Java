package JAVA_PROGRAMS.Topics.Array_2D_15;

public class Spiral_Matrix_5 {
    public static void spiralMatrix(int[][] matrix){
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn){
            for (int j = startColumn; j <= endColumn; j++){
                System.out.print(matrix[startRow][j] + " " );
            }
            for (int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endColumn]+ " ");
            }
            for (int j = endColumn - 1; j >= startColumn; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            for (int i = endRow - 1; i > startRow; i--){
                if(startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+ " ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
        spiralMatrix(matrix);
    }
}
