/*
        If :
            -> if the condition is true if block code will be excutes.

            if()
            {
                // this block of code will be excuted..
            }
        else if :
            if condition fails then it goes to else if this condtion is true it will excute otherwise else block will excute.
            else if
            {
                // this block of code will excute..
            }
        else :
            if condition fails else block will be excuted...
            else
            {
                // this block will be excuted..
            }

 */

import java.util.Scanner;

public class if_else {

    public static void number_validation(int num){
        if (num>0){
            System.out.println("Number is positive..");
        }
        else if(num<0){
            System.out.println("Number is Negative..");
        }
        else {
            System.out.println("Number is Zero..");
        }
    }


    public static void Check_elegible_vote(int age){
        if(age > 18){
            System.out.println("You are Eligible to vote..");
        }
        else{
            System.out.println("Not Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a age:");
        int age = sc.nextInt();
        Check_elegible_vote(age);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        number_validation(num);
    }
    
}
