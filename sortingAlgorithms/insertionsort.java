import java.util.Random;
import java.util.Scanner;

public class insertionsort {

    public static void printArr(int []arr){

        for(int data : arr){
            System.out.printf("%d ",data);
        }
        System.out.println();
    }

    public static int [] insertion_sort(int [] arr){

        int key;
        int currentindex;
        int compareIndex;

        for(currentindex = 1; currentindex < arr.length; currentindex++){
            key = arr[currentindex];
            compareIndex = currentindex - 1;

            while (compareIndex >= 0 && key < arr[compareIndex]){
                arr[compareIndex+1] = arr[compareIndex];
                compareIndex--;

            }

            arr[compareIndex+1] = key;

        }

        return arr;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int size = sc.nextInt();
        int arr_ind;

        // array creation
        int [] arr  = new int[size];

        // filling  elements  into array from userEnd
        for(arr_ind = 0; arr_ind < size ; arr_ind++){
            arr[arr_ind] = rnd.nextInt(100);

        }

        printArr(arr);
        insertion_sort(arr);
        printArr(arr);
        
    }
}
