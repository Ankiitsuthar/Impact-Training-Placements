package Day17;
import java.util.*;
public class Search_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array of Row:");
        int row = sc.nextInt();
        System.out.println("Enter The Size of Array of Colum:");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter the Target Element:");
        int target =sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(searchMatrix(matrix,target));

    }
}
