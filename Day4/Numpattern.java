package Day4;
import java.util.*;
public class Numpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
