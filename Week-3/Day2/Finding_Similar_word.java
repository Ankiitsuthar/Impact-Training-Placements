package Day13;
import java.util.*;
public class Finding_Similar_word {

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }


    public static int countFrequency(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) 
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The word :");
        String str = sc.nextLine();
        System.out.println("Enter the Character :");
        char ch = (sc.next()).charAt(0);

        int count = countFrequency(str , ch);
        System.out.println("Frequency Count of Similar word : "+count);
    //    String result = printLetter(str);

      
    }
}
