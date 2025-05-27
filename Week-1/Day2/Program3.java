import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");

        int n = sc.nextInt();
        if(n==0){
            System.out.println("The Number is : 0");
        }else if(n <=5){
            if(n % 2 == 0)
                
                System.out.println("The Number is : Not Weird");
            }
        }else if(n <=20 & n >=6 ) {
            System.out.println("The Number is : weird");
        }else{
            System.out.println("The Number is : Not Weird");
        }
    }
}
