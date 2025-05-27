package Day12;

public class Toggle_ith_bit {
    public static void main(String[] args) {
        int binary = Integer.parseInt("101001",2);
        int i =  3; 

        int res = 1<<i ^ binary ; //XOR Operator
        System.out.println(res+" In decimal-> "+Integer.toBinaryString(res));

    }
}

