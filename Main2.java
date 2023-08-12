import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        s.close();
        int fact=1;
        for (int i = 2; i <=n; i++) {
           fact=fact*i;
            
            
        }
        System.out.println(fact);
    }
    
}
