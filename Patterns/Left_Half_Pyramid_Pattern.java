import java.util.Scanner;

public class Left_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row;
        int col;
        int printCol;


        for(row=number;row>=0;row--){

            for(col=1;col<=row;col++){
                System.out.print(" ");
            }

            for(printCol=1;printCol<=number-row;printCol++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
