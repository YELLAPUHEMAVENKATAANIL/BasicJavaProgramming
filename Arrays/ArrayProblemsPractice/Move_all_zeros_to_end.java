
import java.util.Scanner;

public class Move_all_zeros_to_end {

    public static void printarr(int [] arr){
        
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void move_all_zeros(int [] arr){

        int n = arr.length;
        int [] temp = new int[n];
        int arr_ind;
        int count=0;

        for(arr_ind=0;arr_ind<n;arr_ind++){
            if(arr[arr_ind] != 0){
                temp[count++] = arr[arr_ind];
            }
        }
        while(count<n){
            temp[count++] = 0;
        }

        for(arr_ind=0;arr_ind<n;arr_ind++){
            arr[arr_ind] = temp[arr_ind];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size=  sc.nextInt();
        int [] arr = new int[size];
        int arr_ind;

        for(arr_ind=0;arr_ind<size;arr_ind++){
            arr[arr_ind] = sc.nextInt();
        }

        printarr(arr);
        
        move_all_zeros(arr);
        System.out.println("All Zerors are Moved Last:");
        printarr(arr);
        

    }
}
