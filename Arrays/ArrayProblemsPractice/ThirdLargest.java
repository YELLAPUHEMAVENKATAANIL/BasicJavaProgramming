import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargest {

    // Method -1 
    public static void third_Largest1(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        
        System.out.println("Third largest element of method1 :"+arr[n-3]);
        
    }
    // Method -2
    public static void third_Largest2(int [] arr){

        int third_Largest = Integer.MIN_VALUE;
        int second_Largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        int arr_ind;

        for(arr_ind=0;arr_ind<arr.length;arr_ind++){
            if(arr[arr_ind] > largest){
                largest = arr[arr_ind];
            }
        }
         for(arr_ind=0;arr_ind<arr.length;arr_ind++){
            if(arr[arr_ind] > second_Largest && arr[arr_ind] <largest){
                second_Largest = arr[arr_ind];
            }
        }
         for(arr_ind=0;arr_ind<arr.length;arr_ind++){
            if(arr[arr_ind] > third_Largest && arr[arr_ind] <second_Largest){
                    third_Largest = arr[arr_ind];
            }
        }
        System.out.println("Third largest element of method2:"+third_Largest);

    }


     public static void third_Largest3(int [] arr){

        int third_Largest = Integer.MIN_VALUE;
        int second_Largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        int arr_ind;

        for(arr_ind=0;arr_ind<arr.length;arr_ind++){

            if(arr[arr_ind] > largest){
                third_Largest = second_Largest;
                second_Largest = largest;
                largest = arr[arr_ind];
            }

            else  if (arr[arr_ind] > second_Largest && arr[arr_ind] <largest){
                third_Largest = second_Largest;
                second_Largest = arr[arr_ind];
            }
            else if (arr[arr_ind] > third_Largest && arr[arr_ind] <second_Largest){
                third_Largest = arr[arr_ind];
            }

        }
        System.out.println("Third largest element of method3:"+third_Largest);


     }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int [] arr = new int[size];
        int arr_ind;
        for(arr_ind=0;arr_ind<size;arr_ind++){
            arr[arr_ind] = sc.nextInt();
        }

        third_Largest1(arr);
        third_Largest2(arr);
        third_Largest3(arr);
    }
}
