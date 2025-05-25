package Arrays;
/* 
    Single Dimensional Array

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        // int [] arr ={10,20,30,40};

        int [] arr = new int[size];
        int arr_ind;

        for(arr_ind=0;arr_ind<size;arr_ind++){
            arr[arr_ind] = sc.nextInt();
        }
        System.out.println("Printing array Elements:");
        for(arr_ind=0;arr_ind<size;arr_ind++){
            System.out.print(arr[arr_ind]+" ");
        }

    }
    
}
*/

import java.util.Scanner;
import java.util.Random;

class Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int [][] arr = new int [size1][size2];
        int row;
        int col;

        for(row=0;row<size1;row++){
            for(col=0;col<size2;col++){
                arr[row][col] = rnd.nextInt(100);
            }
        }

        System.out.println("printing 2d array");
        for(row=0;row<size1;row++){
            for(col=0;col<size2;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}