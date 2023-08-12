public class Main4{
    public static void main(String[] args) {
        int arr=args.length;
        for (int i = 1; i < arr; i++) {
            int t=Integer.parseInt(args[i]);
            int j=i-1;
            while( j >=0 && Integer.parseInt(args[j])>t) {
                args[j+1]=args[j];
                
            }
           ( args[j+1])=Integer.toString(t);
            
        }
        System.out.println("Sorted arrray are");
        for (String num : args) {
            System.out.print(num + " ");
        }
            
        }

    }

    
