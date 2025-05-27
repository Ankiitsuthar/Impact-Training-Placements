package Day9;

import java.util.*;

public class MoveZerosandOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.print("Enter array values : ");
        // for(int i=0; i<n; i++) {
        // arr[i] = sc.nextInt();
        // }

        for (int i = 0; i < n; i++) {
            int rev = 0;
            int count = 0;
            int m = sc.nextInt();
            while (m != 0) {
                int reminder = m % 10;
                if (reminder == 1) {
                    rev = rev * 10 + reminder;

                } else {
                    count++;
                }
                m = m / 10;
            }
            int pow = (int) Math.pow(10, count);
            System.out.println(rev * pow);
        }
    }
}
