package Day9;

import java.util.*;

public class Online_Game {
    public static void Swap_Array(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // int temp = 0;
        System.out.print("Enter array values : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;

        while (left < right) {
            if(arr[left]%2==0){
                left++;
            } else if(arr[right]%2!=0){
                right--;
            }else{
                Swap_Array(arr, left, right);
                left++;
                right--;
            }
        }
        System.out.println("After Sepration :");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
