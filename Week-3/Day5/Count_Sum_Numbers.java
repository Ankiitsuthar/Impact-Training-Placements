package Day16;

import java.util.*;

public class Count_Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String str = sc.nextLine();
        String num = "0123456789";
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            if (num.indexOf(str.charAt(i)) != -1) {
                sum += num.indexOf(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
