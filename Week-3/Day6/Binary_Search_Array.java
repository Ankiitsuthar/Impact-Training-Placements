package Day17;

import java.util.*;

public class Binary_Search_Array {
    public static void main(String[] args) {
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
    }
}
