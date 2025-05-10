package Day4;
import java.util.*;
public class Dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number :");
        int dec = sc.nextInt();
        int bin = 0;
        int pow = 0;
        int temp = dec;
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + rem * (int)Math.pow(10, pow);
            dec = dec/2;
            pow++;
        }
        System.out.println("The Decimal Number "+temp+" to Binary Number is :"+bin);
    }
}
