import java.util.Scanner;

public class smallestelement {

    public static void smallest_ele(int [] arr){

        int smallest = Integer.MAX_VALUE;
         int arr_ind;
        for(arr_ind = 0 ; arr_ind < arr.length; arr_ind++){

            if(arr[arr_ind] < smallest){
                smallest = arr[arr_ind];
            }
        }

        System.out.println("The Smallest Element is :"+smallest);

    }

    public static void Second_Smallest_ele(int [] arr){

        int arr_ind;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(arr_ind = 0 ; arr_ind < arr.length ; arr_ind++){

            if(arr[arr_ind] < smallest){
                smallest = arr[arr_ind];
            }
            else if (arr[arr_ind] < secondsmallest && arr[arr_ind] !=smallest){
                secondsmallest = arr[arr_ind];
            }
        }
        System.out.println("The Second Smallest Element is :"+secondsmallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size=  sc.nextInt();

        int [] arr = new int[size];
        int arr_ind;

        for(arr_ind = 0 ; arr_ind < size ; arr_ind++){
            arr[arr_ind] = sc.nextInt();
        }

        smallest_ele(arr);
        Second_Smallest_ele(arr);


    }
}
