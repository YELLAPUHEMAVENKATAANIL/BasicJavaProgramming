
import java.util.Scanner;

public class Square_Hollow_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int number = sc.nextInt();
        int row;
        int col;

        for (row=0;row<number;row++){
            for(col=0;col<number;col++){
                if (row == 0 || col == 0 || row == number-1|| col == number-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
        }
        System.out.println();
    }
    
    }        
}
