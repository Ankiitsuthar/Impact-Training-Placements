import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for Special number  Starting Number:");
        int start = sc.nextInt();
        System.out.println("Enter the range for Special number  Ending Number:");
        int end = sc.nextInt();
        for(int i = start; i<=end; i++){
            int first = i/10;
            int last = i%10;
            int sum = first+last;
            int pro = first*last;
            int sp = sum+pro;
            if(sp == i){
                System.out.println("The Given Number is Special Number :"+sp);
            }
        }
    }
    
}
