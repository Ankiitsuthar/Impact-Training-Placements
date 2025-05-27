public class Program1 {
    public static void main(String[] args) {
        int num = 123;

        // While Loop approch is wrong
        // int i = 0;
        // while(num > i){
        // int rev = num%10;
        // System.out.print(rev);
        // num++;

        // }

        // For loop Approch is correct
        // for(int i=0; num>0; i++){
        // int rev = num%10;
        // num = num/10;
        // System.out.print(rev);
        // }

        int first = num/100;
        int middle = ((num/10)%10);
        int last = num%10;
        System.out.println(last+" "+middle+" "+first);



    }
}
