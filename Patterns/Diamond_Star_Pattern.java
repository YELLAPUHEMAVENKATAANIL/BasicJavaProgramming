import java.util.Scanner;

public class Diamond_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row;
        int col;
        int printCol;

        for(row=1;row<number;row++){

            for(col=1;col<=number-row;col++){
                System.out.print(" ");
            }

            for(printCol=1;printCol<=row;printCol++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


         for(row=number-1;row>=0;row--){

            for(col=1;col<=number-row;col++){
                System.out.print(" ");
            }

            for(printCol=1;printCol<=row;printCol++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
