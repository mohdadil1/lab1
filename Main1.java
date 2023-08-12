import java.util.*;
public class Main1 {
    public static void main(String[] args) {
Scanner n=new Scanner(System.in);
System.out.println("enter a number");
int num=n.nextInt();
n.close();
boolean f=false;
for (int i = 2; i*i<=num; i++) {
if (num%i==0) {
    f=true;
    break;
    }
   
}
if(f)
{
    System.out.println("Number is composite");
}
 
 else {
    System.out.println("Number is prime");
}    
    }
}
