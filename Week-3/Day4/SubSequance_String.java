package Day15;

import java.util.*;

public class SubSequance_String {
    public static int subStringCheck (String name, String substring) {
        String substr = "";
        for(int i=0; i<name.length(); i++){
            substr += name.charAt(i);
            System.out.println("Sub String is "+substr);
            if(substr.equals(substring)){
                // System.out.println("1");
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = sc.next();
        System.out.println("Enter the Substring to check :");
        String substring = sc.next();
        int result = subStringCheck(name, substring);
        System.out.println(result);
        // String name[] = new String[n];
        // for(int i=0; i<n; i++){
        //     name[i] = sc.ne
        // }
        // char ch = 0;
        // int count = 0;
        
    }
}
