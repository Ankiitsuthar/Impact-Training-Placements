import java.util.*;
public class Harrypotter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Door Number :");
        int n = sc.nextInt();
        int first_digit = n/1000;
        int second_digit = n%10;
        System.out.println(first_digit+second_digit);
    }
}
