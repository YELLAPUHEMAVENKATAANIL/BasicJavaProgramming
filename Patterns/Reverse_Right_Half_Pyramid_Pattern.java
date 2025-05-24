import java.util.Scanner;

public class Reverse_Right_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row;
        int col;

        for(row=1;row<=number;row++){
            for(col=1;col<=number-row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
