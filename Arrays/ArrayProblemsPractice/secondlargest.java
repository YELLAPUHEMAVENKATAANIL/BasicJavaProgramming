package Arrays.ArrayProblemsPractice;

import java.util.Scanner;

public class secondlargest {

    public static void second_largest(int [] arr){

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int arr_ind;

        for(arr_ind = 0; arr_ind < arr.length ; arr_ind++){
            if(arr[arr_ind] > largest){
                secondlargest = largest;
                largest = arr[arr_ind];
            }
            else if (arr[arr_ind] > secondlargest && arr[arr_ind] != largest){
                secondlargest = arr[arr_ind];
            }
        }

        // for(arr_ind = 0; arr_ind < arr.length; arr_ind++){
        //     if(arr[arr_ind] > secondlargest && arr[arr_ind] != largest){
        //         secondlargest = arr[arr_ind];
        //     }
        // }
        System.out.println("secondLargest :"+secondlargest);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr_ind;

        for(arr_ind = 0; arr_ind < size; arr_ind++){
            arr[arr_ind] = sc.nextInt();
        }

        second_largest(arr);
    }
}
