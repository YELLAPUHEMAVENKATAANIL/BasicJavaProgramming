import java.util.Scanner;

class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Venkata Anil";   // This string is string literal.

        // str.concat("Yellapu");   // This statement wont print the concated string ... 
        str = str.concat("Yeallpu"); // This will print concat string.

        System.out.println(str);

        String strvalue = new String("Varalakshmi");
        String strvalue1 = new String("Varalakshmi").intern();  /// because it will refer only one object...
         System.out.println(strvalue);
         System.out.println(strvalue1);

    }
}