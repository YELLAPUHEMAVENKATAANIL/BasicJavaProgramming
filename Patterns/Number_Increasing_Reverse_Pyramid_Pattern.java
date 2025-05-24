
import java.util.Scanner;

public class Number_Increasing_Reverse_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row;
        int col;

        for(row=number;row>1;row--){
            for(col=1;col<row;col++){
                System.err.print(col +" ");
            }
            System.out.println();
        }
    }
}
