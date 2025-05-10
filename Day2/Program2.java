import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Single Digit Number :");0

        int n = sc.nextInt();
        if(n==0){
            System.out.println("The Number is : 0");
        }else if(n % 2 == 0){
            System.out.println("The Number is : Even");
        }else{
            System.out.println("The Number is : Odd");
        }
    }
}
