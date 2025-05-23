/*
    while Loop :
        -> Loops can execute a block of code as long as a specified condition is reached.
        -> while loop is used for we dont know the how many times to run a loop.

        Syntax :
                initialization
            -> while(condition){
                
                print.....
                increment / decrement ..
            }

        do while Loop :
            -> It will Execute once a time if condition fails also
            -> if we want to excute loop once we can use do while Loop

            Synatx :
                    initialization
                do{
                    increment / decrement
                    print...
                }while(condition);


 */



import java.util.Scanner;

public class while_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        while (num!=0){
            System.out.print(num +" ");
            num--;
        }
        System.out.println();
        System.out.println("This is for do while loop");
        do{
            num++;
            System.out.print(num+" ");

        }while(num<10);

    }
}
