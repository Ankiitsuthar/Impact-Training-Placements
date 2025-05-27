package Day13;

import java.util.*;

public class Finding_vowels_count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The word :");
        String str = sc.nextLine();
        System.out.println("Enter the vowel :");
        char ch = (sc.next()).charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The count of Vowel "+ch+" is :"+count);
    }

}    
