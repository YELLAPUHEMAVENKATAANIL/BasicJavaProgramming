
import java.util.Scanner;
import java.util.Random;
public class Majority_Element {

    public static int majority_Element(int []arr){

        int n = arr.length;
        int Oarr_ind;
        int Iarr_ind;;

        for(Oarr_ind=0;Oarr_ind<n;Oarr_ind++){
            int count =0;
            for(Iarr_ind=0;Iarr_ind<n;Iarr_ind++){

                if(arr[Oarr_ind] == arr[Iarr_ind]){
                    count +=1;
                }
            }

            if (count > n/2){
                return arr[Oarr_ind];
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter size of the Array:");
        int size = sc.nextInt();

        int [] arr = new int[size];
        int arr_ind;

        for(arr_ind=0;arr_ind<size;arr_ind++){
            // arr[arr_ind] = rnd.nextInt(50);
            arr[arr_ind] = sc.nextInt();
        }

        int result =majority_Element(arr);

       if(result > 0){
        System.out.println("Majority element is:"+result);
       }
       else {
        System.out.println("No Majority Element"+result);
       }
    }
}

