
/*
    Switch :
        -> Instead of writing many if..else statements, we can use the switch statement.
        -> The switch statement selects one of many code blocks to be executed

        switch(expression) 
        {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
        }

 */

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day:");
        int day = sc.nextInt();

        switch (day) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
    
}
