package Day10;
import java.util.*;
public class Bin_to_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Binary Number :");
        int bin = sc.nextInt();
        int dec = 0;
        int pow = 0;
        int temp = bin;
        while (bin > 0) {
            int rem = bin % 10;
            dec = dec + rem * (int)Math.pow(2, pow);
            bin = bin/10;
            pow++;
        }
        System.out.println("The Binary Number is "+temp+" to Decimal Number : "+dec);
    }
}
