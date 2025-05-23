
/*
    ForLoop :
        -> Types of ForLoops:
            -> ForLoop
            ->Nested ForLoop
            ->For-Each Loop


    ->  exactly how many times we want to run loop through a block of code, we will use the for loop.
    Syntax:
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }
        statement1 : initialization
        statement2: Condition
        Statement3: Increment / decrement

    -> Nested ForLoop 
        -> Loop inisde loop is called nested ForLoop

        Syntax :
        for (statement 1; statement 2; statement 3) {
           
            for (statement 1; statement 2; statement 3) {
            // code block to be executed
            }
        }
            
    -> For-Each Loop
        -> "for-each" loop, which is used exclusively to loop through elements in an array.
        Syntax :
            -> for (type variableName : arrayName)
                {
                // code block to be executed
                }


 */

import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int val1;
        int val2;
        for(val1=1;val1<=size;val1++){
            System.out.print(val1+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Printing Stars:");
        for(val1=1;val1<=size;val1++){
            for(val2=1;val2<=size;val2++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Using For Each-Loop");
        int [] arr = {10,20,30,40,50,60,70,80,90};

        for(int data : arr){
            System.out.print(data + " ");
        }
    }
}
