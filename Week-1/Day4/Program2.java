package Day4;
import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int square = n*n;
        int length = String.valueOf(Math.abs(n)).length();
        System.out.println("Length of number: " + length);
        System.out.println("The Square of Number is :"+square);
        if(length == 3){
            int last = square%1000;
            int first = square/1000;
            int sum = first+last;
            if(sum==n){
                System.out.println("The Number is jaffer:"+n);
            }else{
                System.out.println("The Number is Not Jaffer:");
            }
        }else if(length == 2){
            int last = square%100;
            int first = square/100;
            int sum = first+last;
            if(sum==n){
                System.out.println("The Number is jaffer:"+n);
            }else{
                System.out.println("The Number is Not Jaffer:");
            }
        }
    }
}
