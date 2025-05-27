package Day14;

import java.util.*;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line of Word :");
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String is :"+reversed);
    }
}
