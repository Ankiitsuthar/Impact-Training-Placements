public class Program5 {
    public static void main(String[] args) {
        int n = 14;
        // int fib = 0;
        int first = 0;
        int second = 1;
        for(int i = 1; i<=n; i++){
            System.out.println(first);
            // int fib = initial+i;
            // fib = fib+i;
            int next = first + second;
            first = second;
            second = next;

        }
    }
}
