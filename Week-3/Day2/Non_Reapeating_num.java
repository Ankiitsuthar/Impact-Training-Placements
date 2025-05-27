package Day13;
import java.util.*;
public class Non_Reapeating_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Array Element :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int num = 0;
        for(int i=0; i<n; i++){
            num = num ^ arr[i];

        }
        System.out.println("The Smallest Non Reapeating Number in an Array is : "+num);

    }
}
