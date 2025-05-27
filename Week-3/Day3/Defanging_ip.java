package Day14;

import java.util.*;

public class Defanging_ip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address :");
        String s = sc.nextLine();
        System.out.println(s.replace(".","[.]"));
    }
}
