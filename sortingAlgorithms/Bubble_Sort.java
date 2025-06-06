

/*
    Bubble sort : 
        -> Bubble sorting is the simplest sorting Algorithm that works repeatedly swapping 
           the adjacent elements if they are in the wrong order.
        -> This algorithm is not suitable for large data sets as its average and worst-case time complexity are quite high


    Bubble Sort Algorithm :
    
        -> Start at the beginning of the list.
        -> Compare each pair of adjacent elements.
        -> If the elements are in the wrong order, swap them.
        -> Move to the next pair and repeat step 3 until the end of the list.
        -> After each pass through the list, the largest element moves to its correct position.
        -> Continue making passes until fully sorted. 

 */
import java.util.Random;
import java.util.Scanner;

public class Bubble_Sort {
    public static void printArr(int arr[]){
        for(int data : arr){
            System.out.printf("%d ",data);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int size = sc.nextInt();

        // int arr [] = {7,8,3,1,2};
        int arr[] = new int [size];
        int arr_ind;

        for(arr_ind = 0; arr_ind < size ; arr_ind++ ){
            arr[arr_ind] = rnd.nextInt(100);
        }
        int row;
        int col;

        printArr(arr);

        for(row =0;row<arr.length;row++){
            for(col =0;col<arr.length-row-1;col++){

                if(arr[col] > arr[col+1]){

                    int temp = arr[col];
                    arr[col] = arr[col+1];
                    arr[col+1] = temp;
                }
            }
        }
        printArr(arr);
    }
}
