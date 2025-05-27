package Day5;

public class Hollow_rectangle {
    public static void hollow_rectangle(int n){
        int row = n;
        for(int i = 1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if((i==1) || (i==n) || (j==1) || (j==n)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4);
    }
}
