package Day6;
import java.util.*;
public class Acc_2021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = {35, 9, 1};
        int count=0;
        for(int i = 0; i<arr.length; i++){
            int x = 1;
            int y = (int)Math.cbrt(arr[i]);
            int z = (int)Math.pow(x, 3)+(int)Math.pow(y, 3);
            if(z==arr[i]){
                count++;
            }else if(arr[i] >= z){
                x++;
            }else{
                y--;
            }
        }
        System.out.println(count);

    }
}
