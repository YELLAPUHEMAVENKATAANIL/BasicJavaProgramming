
import java.util.Random;
import java.util.Scanner;

public class selection_sort {

    public static void print(int arr[]){

        for(int data : arr){
            System.out.printf("%d ",data);
        }
        System.out.println();
    }

    public static int [] selection_sort(int arr[]){
        
        int arr_ind1;
        int arr_ind2;

        for(arr_ind1 = 0 ; arr_ind1 < arr.length-1; arr_ind1++){
            int smallest = arr_ind1;

            for(arr_ind2 = arr_ind1+1; arr_ind2 < arr.length; arr_ind2++){

                if (arr[smallest] > arr[arr_ind2] ){
                    smallest = arr_ind2;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[arr_ind1];
            arr[arr_ind1] = temp;
        }
        return arr;
    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int size = sc.nextInt();
        int arr []  = new int[size];
        int arr_ind;

        for(arr_ind = 0; arr_ind < size; arr_ind++){
            arr[arr_ind] = rnd.nextInt(100);
        }
        print(arr);
        selection_sort(arr);
        print(arr);
    }
}
