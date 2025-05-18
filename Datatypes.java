import java.util.Scanner;
public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte bvalue = sc.nextByte();
        short svalue = sc.nextShort();
        int ivalue = sc.nextInt();
        long lvalue = sc.nextLong();

        boolean boolvalue1 = true;
        boolean boolvalue2 = false;

        float fvalue = sc.nextFloat();
        double dvalue = sc.nextDouble();

        char cvalue = sc.next().charAt(0);

        System.out.println("Byte value is "+ bvalue);
        System.out.println("Short value is:"+svalue);
        System.out.println("Integer value is"+ivalue);
        System.out.println("Long value is "+lvalue);
        System.out.println("float value is"+fvalue);
        System.out.println("Double value is:"+dvalue);
        System.out.println("char value is"+cvalue);
        System.out.println("Boolean value is "+boolvalue1);
        System.out.println("Boolean value is "+boolvalue2);

        sc.close();

    }
    
}
