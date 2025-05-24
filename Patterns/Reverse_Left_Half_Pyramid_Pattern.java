import java.util.Scanner;

public class Reverse_Left_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row;
        int col;
        int printcol;

        for(row =number;row>=0;row--){

            for(col=1;col<=number-row;col++){
                System.out.print(" ");
            }

            for(printcol=1;printcol<=row;printcol++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
