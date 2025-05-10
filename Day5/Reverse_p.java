package Day5;

public class Reverse_p {
    public static void reverse_pyramid(int n){
        int row = n;
        // for(int i = 1; i<=row; i++){
            
        //     //Star
        //     for(int j=4; j>=i; j--){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        //Second Approch 
        for(int i = 1; i<=row; i++){
            
            //Star
            for(int j=1; j<=(row-i)+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }


    public static void inverted_pyramid(int n){
        int row = n;
        for(int i = 0; i<=row; i++){
            
            //Spaces
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=row-i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    public static void main(String[] args) {
        reverse_pyramid(4);
        inverted_pyramid(4);
    }
}
