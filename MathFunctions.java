/* 
->  Java Math class has many methods that allows you to perform mathematical tasks on numbers.

    They are :
        ->  Math.max(x,y)  : The method can be used to find the highest value of x and y
        -> Math.min(x,y)   : The method can be used to find the lowest value of x and y
        -> Math.sqrt(x)    : The method returns the square root of x
        -> Math.abs(x)     : The method returns the absolute (positive) value of x
        -> Math.random()   : returns a random number between 0.0 (inclusive), and 1.0 (exclusive)

*/

import java.util.Scanner;

class MathFunctions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maxResult = Math.max(num1, num2);

        int minResult = Math.min(num1, num2);
        int sqrtResult = (int) Math.sqrt(num1);

        int postiveAbs = Math.abs(maxResult);
        double  randomResult = Math.random();

        System.out.println(maxResult);
        System.out.println(minResult);
        System.out.println(sqrtResult);
        System.out.println(postiveAbs);
        System.out.println(randomResult);
    
    }
}