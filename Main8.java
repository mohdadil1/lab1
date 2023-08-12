 import java.util.*;

public class Main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        
        char[] chars = str.toCharArray();
        sc.close();

        
        int[] freq = new int[256];
        for (int i = 0; i < chars.length; i++) {
            freq[chars[i]]++;
        }

        
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] != 0) {
        
                System.out.println((char) i + " " + freq[i]);

                
                freq[i]--;
            }
        }
    }
}

    

