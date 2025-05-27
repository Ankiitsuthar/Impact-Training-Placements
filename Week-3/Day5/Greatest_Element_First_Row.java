package Day16;

import java.util.*;

public class Greatest_Element_First_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array of Row:");
        int row = sc.nextInt();
        System.out.println("Enter The Size of Array of Colum:");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            int high = 0;
            for(int j=0; j<col; j++){
                high = Math.max(high, arr[i][j]);
            }
            System.out.println("Max Element in row "+(i+1)+" is :"+high);
        }
    }
}
