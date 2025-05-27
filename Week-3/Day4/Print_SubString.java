package Day15;
import java.util.*;
public class Print_SubString {

    public static void subStringCheck (String name) {
        String substr = "";
        for(int i=0; i<name.length(); i++){
            substr += name.charAt(i);
            System.out.println("Sub String is "+substr);
            // if(substr.equals(substring)){
            //     // System.out.println("1");
            // }
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = sc.next();
        subStringCheck(name);
    }
}
