import java.util.Scanner;

public class palindrome {

    public static boolean ispalindrome(String str){

        int left =0;
        int right = str.length()-1;
        boolean found = false;

        while(left < right){

            if (str.charAt(left) == str.charAt(right))
                found = true;

            left++;
            right--;

        }
        return  found;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str  = sc.next();

        boolean result = ispalindrome(str);
        System.out.println(result);
        
    }
}
