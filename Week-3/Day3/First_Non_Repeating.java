package Day14;

public class First_Non_Repeating {
    public static void main(String[] args) {
        String s ="daahefghedb";
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }
        
    }
}
