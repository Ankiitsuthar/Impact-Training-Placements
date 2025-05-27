package Day6;
import java.util.*;
public class Array_compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array :");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter The Element in Array1 :");
            arr1[i] = sc.nextInt();        
        }
        for(int i=0; i<n; i++){
            System.out.println("Enter The Element in Array2 :");
            arr2[i] = sc.nextInt();        
        }
        for(int i=0; i<n; i++){
            if(arr1[i] >= arr2[i]){
                count++;
            }        
        }
        if(count == n){
            System.out.println("Compactable");
        }else{
            System.out.println("Incompactable");
        }
    }
}
