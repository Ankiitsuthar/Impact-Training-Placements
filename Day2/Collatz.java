import java.util.*;
public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n!=0) {
            System.out.println(n+"->");
            if(n%2 == 0){
                n = n/2;
            }else{
                n = ((3*n)+1);
            }
            count++;
            System.out.println("The Conunt : "+count);
        }
        System.out.println("1");
    }
}
