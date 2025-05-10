package Day4;
import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        //Adam Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int sq_original = n*n;
        System.out.println("The Square of Given Number:"+sq_original);
        int rev = 0;
        while (n!=0) {
            int r = n%10;
            rev = (rev*10+r);
            n = n / 10;
        }
        System.out.println("The Reverse Number is :"+rev);
        int sq_after_reverse = rev*rev;
        System.out.println("The Square after the Reverse :"+sq_after_reverse);
        int after_rev = 0;
        while (sq_after_reverse!=0) {
            int r = sq_after_reverse%10;
            after_rev = (after_rev*10+r);
            sq_after_reverse = sq_after_reverse / 10;
        }
        int revser_sq_number = sq_after_reverse;
        if(sq_original == revser_sq_number){
            System.out.println("The Given Number "+n+" is Adam Number:"+sq_original);
        }else{
            System.out.println("The Given Number "+sq_after_reverse+"is Not Adam Number:"+revser_sq_number);
        }

    }
}
