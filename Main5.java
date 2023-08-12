public class Main5 {
    public static void main(String[] args) {

        String str = args[0];

        int s = 0, e = args[0].length() - 1;
    

        boolean flag = true;
        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                flag = false;
                break;
            }
            s++;
            e--;

        }
        if (flag) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");

        }
    }
}
