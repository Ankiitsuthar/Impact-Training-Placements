package Day9;

import java.util.Scanner;

public class Smallest_mising_positive_num {
    public static void Sort_Array(int arr[]){
        //sort the array 
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] < arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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
        Sort_Array(arr);
        int smallest = 1;
        for(int i=0; i<n; i++){
            if(smallest==arr[i]){
                smallest++;
                i=0;
            }
        }
        System.out.println("Smallest Number is : "+smallest);
    }
}
