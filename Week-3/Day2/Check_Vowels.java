package Day13;

import java.util.*;

public class Check_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The word :");
        String str = sc.nextLine();
        String vowel = "aeiouAEIOU";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char v = str.charAt(i);
            if(vowel.indexOf(v) != -1){
                count++;
            }
        }
        System.out.println("The Vowels Count is : "+count);
    }
}
