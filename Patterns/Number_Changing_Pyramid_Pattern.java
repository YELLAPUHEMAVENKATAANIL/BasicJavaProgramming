
import java.util.Scanner;

public class Number_Changing_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row;
        int col;
        int count =1;
        for(row=1;row<number;row++){
            for(col=1;col<row;col++){
               System.out.print(count+" ");
               count++;
            }
            System.out.println();
        }
    }
    
}
