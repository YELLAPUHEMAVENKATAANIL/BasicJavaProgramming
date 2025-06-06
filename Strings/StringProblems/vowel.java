import java.util.*;
class vowel {

    public static boolean isVowel(char ch){

        return  ch == 'a' || ch == 'A' ||
                ch == 'e' ||ch == 'E' ||
                ch == 'i' ||ch == 'I' ||
                ch == 'o' ||ch == 'O' ||
                ch == 'u' ||ch == 'U';
                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int str_ind;

        for(str_ind = 0 ; str_ind < str.length() ; str_ind++){
            if(isVowel(str.charAt(str_ind))){
                System.out.printf("%c \t",str.charAt(str_ind));
            }
            else {
                System.out.printf(" ");
            }
        }
    }
}