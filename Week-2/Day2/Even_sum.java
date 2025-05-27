package Day7;
import java.util.*;
public class Even_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Element of Array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int Even_sum = 0;
        int Odd_sum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                Even_sum = Even_sum+arr[i];
            }else{
                Odd_sum = Odd_sum+arr[i];
            }
        }
        System.out.println("Even Sum of Array :"+Even_sum);
        System.out.println("Odd of Array :"+Odd_sum);
    }
}
