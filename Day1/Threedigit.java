import java.util.*;
public class Threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Digit Number :");
        int n = sc.nextInt();
        int first_digit = n/100;
        int middle_digit = ((n/10)%10);
        // int middle_digit = 
        int last_digit = n%10;
        System.out.println(first_digit+middle_digit+last_digit);
    }
}
