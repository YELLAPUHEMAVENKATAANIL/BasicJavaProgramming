/* 
Operators :
    -> Operators are used to perform operation on variables and values
    
            Types of Operators:

        1.Arithmetic Operators
        2.Assignment Operators
        3.Comparsion Operators
        4.Logical Operators
        5.Bitwise Operators


1. Arithmetic operators :
    -> Arithmetic operators are used to perform common mathematical operations.

    oper    descreption                                        Example
    +       Addition	Adds together two values	            x + y	
    -	    Subtraction	Subtracts one value from another	    x - y	
    *	    Multiplication	Multiplies two values	            x * y	
    /	    Division	Divides one value by another	        x / y	
    %	    Modulus	Returns the division remainder	            x % y	
    ++	    Increment	Increases the value of a variable by 1	++x	
    --	    Decrement	Decreases the value of a variable by 1	--x   */
/* 
import java.util.*;
class operators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int divi =  num1 / num2;
        int modu =  num1 % num2;
        int Incre = num1++;
        int decre = num1--;

        System.out.println("Addition of Two Numbers is:"+add);
        System.out.println("Subtraction of Two Numbers is:"+sub);
        System.out.println("mulitplication of Two Numbers is:"+multi);
        System.out.println("Division of Two Numbers is:"+divi);
        System.out.println("modulo of Two Numbers is:"+modu);
        System.out.println("Increment of Two Numbers is:"+Incre);
        System.out.println("Dcrement of Two Numbers is:"+decre);
      
    }

}
*/



/* 
2. Assignment Operators :
    -> Assignment operators are used to assign values to variables.


    Operator	Example	    Same As	
    =	        x = 5	    x = 5	
    +=	        x += 3	    x = x + 3	
    -=	        x -= 3	    x = x - 3	
    *=	        x *= 3	    x = x * 3	
    /=	        x /= 3	    x = x / 3	
    %=	        x %= 3	    x = x % 3	
    &=	        x &= 3	    x = x & 3	
    |=	        x |= 3	    x = x | 3	
    ^=	        x ^= 3	    x = x ^ 3	
    >>=	        x >>= 3	    x = x >> 3	
    <<=	        x <<= 3	    x = x << 3

*/

class operators{
    public static void main(String[] args) {  
        int num1 =10;

        int add = num1 += 1;
        int sub =num1 -=2;
        int multi =num1 *= 3;
        int div = num1 /= 4;
        int mod = num1 %= 2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);
    }
}

/* 
3. Comparsion operators 
    -> Comparison operators are used to compare two values (or variables).  
    
    Operator	Name	                        Example
    ==	        Equal to	                    x == y	
    !=	        Not equal	                    x != y	
    >	        Greater than	                x > y	
    <	        Less than	                    x < y	
    >=	        Greater than or equal to	    x >= y	
    <=	        Less than or equal to	        x <= y	

*/


/* 
4. Logical Operators
    -> You can also test for true or false values with logical operators.

    Operator	    Name	        Description	                                                Example
    && 	            Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10
    || 	            Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4
    !	            Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
    
*/
