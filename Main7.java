import java.util.*;
public class Main7 {
    public static void main(String[] args) {
        System.out.println("Enter the binary string");
        Scanner string=new Scanner(System.in);
      String str= string.nextLine();
      string.close();
      if(str.matches("[01]+"))
      {
        int decimal=0;
      int pwr=0;
      for (int i=str.length()-1 ;i >=0; i--) {
        if ( str.charAt(i)=='1') {
            decimal+=(Math.pow(2, pwr));

        }
        pwr++;
      }
    
      System.out.println("Decimal equivalent:" + decimal);
      
      }
      else 
      
    {
      System.out.println("Input is not in proper format");

    }
    
    }
    
}
