public class Main3 {
    public static void main(String[] args)  {
        
        int num = Integer.parseInt(args[0]);
        
        int first = 0;
        int second = 1;

        while (num > 0) {
            int temp = first;
            System.out.print(temp + " ");
            first = first + second;
            second = temp;
            num--;
        }
    }
}
