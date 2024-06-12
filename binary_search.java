import java.util.Scanner;
import java.lang.Thread;
public class binary_search extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Taking the input limit of the array */
        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        /* Defining the array */
        int a[] = new int[l];

        System.out.println();
        System.out.println("Enter the elements one by one......");
        /* Importing the values in the array */
        for(int i = 0; i < l; i++){
            a[i] = sc.nextInt();
        }

        /* Sorting the data */
        /* Applying the bubble sort Algorithm */
        int temp = 0;
        for(int i = 0; i < l - 1; i++){
            for(int j = 0; j < l - 1; j++){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        /* After sorting the values we will display the value */
        System.out.println();
        System.out.println("Here are the value in your array.....");
        System.out.println();

        try{
            for(int i : a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.print("Enter the value you want to find: ");
        int f = sc.nextInt();
        System.out.println();

        // System.out.println(Engine(a, l, f));
        System.out.println("--RESULT--");
        System.out.println();
        if(Engine(a, l, f) != -1){
            System.out.println("Element found in the position: "+Engine(a, l, f));
        } else {
            System.out.println("Element not found !");
        }
    }

    public static int Engine(int arr[], int lmt, int find){

        int low = 0;
        int high = lmt - 1;

        for(int i = 0; i < lmt; i++){
            int middle = (low + high) / 2;

            if(find == arr[middle]){
                return middle;
            } else if(find < arr[middle]){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
