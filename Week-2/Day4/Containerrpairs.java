package Day9;
import java.util.*;
public class Containerrpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array values : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //sort the array
        for(int turn=0; turn<n-1; turn++) {
            for(int j=0; j<n-1-turn; j++) {
                if(arr[j] < arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int left = 0;
        int right = n-1;
        while (left<right) {
            System.out.println(arr[left]+" , "+arr[right]);
            left++;
            right--;
        }
         if(left==right) {
            System.out.println(arr[left]);
        }

    }
}
