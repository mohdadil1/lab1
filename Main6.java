import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        int n=args.length;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
       int num= s.nextInt();
       s.close();
       for (int i = 0; i <n; i++) {
        if (Integer.parseInt(args[i])==num) {
            System.out.println("Number is found in the array");
            return;
            
        }
        
       }
       System.out.println("Number is not found in the array");

    }
}
