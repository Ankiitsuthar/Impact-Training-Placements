package Day5;
import java.util.*;
public class Array_insert_evennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                // arr[i] = sc.nextInt();
                System.out.println("The Even Number: "+arr[i]);
            }
        }
    }
}
