
import java.util.Scanner;

public class reverse_String {
    public  static String reverseString(String str){
        StringBuilder res = new StringBuilder();
        int str_ind;
        for(str_ind = str.length()-1 ;str_ind >=0;str_ind--){
            res.append(str.charAt(str_ind));
        }

       return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result =reverseString(str);
        System.out.println("Reversed String is: "+result);
        
        sc.close();
    }
}
