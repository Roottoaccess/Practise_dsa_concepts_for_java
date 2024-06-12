import java.util.Scanner;
import java.lang.Thread;
public class linear_search extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        /* Creating the array for inserting the data */
        int a[] = new int[l];

        /* Inserting the data to the array */
        System.out.println();
        System.out.println("Enter the element one by one..... ");
        for(int i= 0; i < l; i++){
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Displaying the array elements.....");

        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Accepting the value for finding the value */
        System.out.println();
        System.out.print("Enter the value you want to search from the array: ");
        int f = sc.nextInt();

        /* Calling the static method */
        engine(a, l, f);
    }

    public static void engine(int arr[], int lmt, int find){
        /* The main Algorithm starts from here */
        /* Linear Search */
        int count = 0; int pos_count = 0;
        for(int i = 0; i < lmt; i++){
            if(arr[i] == find){
                count ++;
                pos_count = i;
            }
        }
        System.out.println();
        System.out.println("\t--Result--");
        System.out.println();
        if(count > 0){
            System.out.println("Element found "+count+" times and in the position: "+pos_count);
        } else {
            System.out.println("Element not found !");
        }
    }
}
