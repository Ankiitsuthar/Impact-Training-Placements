package Day14;
import java.util.*;
public class Smallest_missing_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alph.length(); i++){
            char ch = alph.charAt(i);
            if(s.indexOf(ch)==-1){
                System.out.println("The Smallest Missing Character is :"+ch);
                break;
            }
        }
    }
}
