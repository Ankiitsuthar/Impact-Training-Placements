package Day14;

import java.util.*;

public class Jewels_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Jewels :");
        String jewel = sc.nextLine();
        System.out.println("Enter the Stones :");
        String stone = sc.nextLine();
        System.out.println("The count of it :"+numJewelsInStones(jewel,stone));
    }
}
