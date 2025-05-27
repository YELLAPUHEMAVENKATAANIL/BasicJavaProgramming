
import java.util.Scanner;

public class largestElement {
    

    public static void largestElement(int [] arr){

        int arr_ind;
        int largest = arr[0];
        for(arr_ind=0;arr_ind<arr.length;arr_ind++){
            if(arr[arr_ind] > largest){
                largest = arr[arr_ind];
            }

        }
        System.out.println("Largest Element:"+largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int[size];
        int arr_ind;

        for(arr_ind=0;arr_ind<size;arr_ind++){
            arr[arr_ind] = sc.nextInt();
        }

        largestElement(arr);

    }
}
