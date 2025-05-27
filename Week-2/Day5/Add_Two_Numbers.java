package Day10;

import java.util.*;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1 values : ");
        int n1 = sc.nextInt();
        System.out.print("Enter size of array1 values : ");
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int result[] = new int[n1];
        int carry = 0;
        int rev1 = 0;
        int rev2 = 0;
        int rev = 0;
        System.out.print("Enter array1 values : ");
        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter array2 values : ");
        for(int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<n1; i++){
            rev1=(rev1*10)+arr1[i];
        }
        System.out.println("The Array1 :"+rev1);
        for(int i=0; i<n2; i++){
            rev2=(rev2*10)+arr2[i];
        }
        System.out.println("The Array2 :"+rev2);
        int sum_after = rev1+rev2;
        System.out.println("The Array Sum :"+sum_after);
        int i = 0;
        while (sum_after != 0) {
            int rem = sum_after%10;
            rev = rev*10+rem;
            sum_after = sum_after/10;
            result[i] = rev; 
            i++;
        }
        System.out.println("After the Sum Resultant Array :"+result[i]);
        // for(int k=0; k<n1; k++){
            
        // }

        // for(int i=0; i<n; i++){
            
        // }
    }
}
