
import java.util.Scanner;


public class Number_Increasing_Pyramid_Pattern  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        int row;
        int col;

        for(row =1;row<=number;row++){
            for(col=1;col<row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        // System.out.println();
    }
}
