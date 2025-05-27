package Day6;
import java.util.*;
public class Array_insert_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element of Array :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element to Insert:");
        int elementToInsert = sc.nextInt();
        System.out.println("Enter The Position to insert :");
        int position = sc.nextInt();
        // int[] newArray = new int[n + 1];

        // for (int i = 0, j = 0; i < newArray.length; i++) {
        //     if (i == position) {
        //         newArray[i] = elementToInsert;
        //     } else {
        //         newArray[i] = arr[j];
        //         j++;
        //     }
        //     System.out.println("After Inserstion of Element in Array :"+newArray[i]);
        // }



        //Sir Approch 
        if(position > n){
            System.out.println("Invalid");
        }else{
            for(int i=0; i<n; i++){
                if(i==position-1){
                    // arr[i] = elementToInsert;
                    System.out.println(elementToInsert);
                }   
                System.out.println(arr[i]);
            }
        }
        

    }
}
