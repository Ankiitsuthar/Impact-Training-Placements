package Day5;

public class Star_pyramid {
    public static void pyramid(int n){
        int row = n;
        for(int i = 1; i<=row; i++){
            //spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(4);
    }
}
