import java.util.*;
public class Wordakshari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Word :");
        String prev = sc.nextLine();
        System.out.println("Enter the second Word :");
        String curr = sc.nextLine();
        int n = prev.length();
        while (curr != "####") {
            if(prev.charAt(n-1) == curr.charAt(0)){
                System.out.println(curr);
                prev=curr;
            } else {
                break;
            }
        }
    }
}