import java.util.Scanner;

public class Number_Triangle_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number=  sc.nextInt();

        int row ;
        int col;
        int printcol;

        for(row=1;row<=number;row++){

            for(col=1;col<=number-row;col++){
                System.out.print("_");
            }

            for(printcol=1;printcol<=row;printcol++){
                System.out.print(row+" ");
            }
            System.out.println();

        }


        
    }
}
