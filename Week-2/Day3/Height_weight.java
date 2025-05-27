package Day8;
import java.util.*;
public class Height_weight {

    public static int index_value(int height[], int max_height, int weight[], int max_weight){
        for(int i=0; i<height.length; i++){
            if(height[i]==max_height){
                System.out.println("At index height value :"+i);
            }
        }
        for(int i=0; i<weight.length; i++){
            if(weight[i]==max_weight){
                System.out.println("At index weight value :"+i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int height[] = new int[n];
        int weight[] = new int[n];
        int max_height = Integer.MIN_VALUE;
        int max_weight = Integer.MIN_VALUE;
        System.out.print("Enter the height :");
        for(int i = 0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.print("Enter the weight :");
        for(int i = 0; i<n; i++){
            weight[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(max_height < height[i]){
                max_height = height[i];
            }
        }
        System.out.println("The Max Height :"+max_height);
         for(int i = 0; i<n; i++){
            if(max_weight < weight[i]){
                max_weight = weight[i];
            }
        }
        System.out.println("The Max Weight :"+max_weight);
        index_value(height, max_height, weight, max_weight);
    }
}
