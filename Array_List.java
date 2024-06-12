import java.util.ArrayList;
import java.lang.Thread;
import java.util.Collections;
public class Array_List extends Thread{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(12);
        list.add(14);
        list.add(16);
        list.add(15);
        list.add(18);
        list.add(112);
        list.add(122);

        
        int size = list.size();
        System.out.println("The size: "+size);
        System.out.println();
        System.out.println("Array before sorting.....");
        System.out.println();
        System.out.println(list);
        // try{
        //     for(int i: list){
        //         System.out.print(i+ " ");
        //         Thread.sleep(500);
        //     }
        // }catch(Exception e){
        //     System.out.println(e);
        // }
        System.out.println();
        System.out.println("Array after sorting.....");
        System.out.println();

        /* Sorting the arrayList */
        Collections.sort(list);

        // try{
        //     for(int i: list){
        //         System.out.print(i+ " ");
        //         Thread.sleep(500);
        //     }
        // }catch(Exception e){
        //     System.out.println(e);
        // }
        System.out.println(list);

        System.out.println(list.get(5));

        System.out.println(list.contains(122));

        list.remove(3);
        System.out.println("After removing 15 from the array list: "+list);

        /* Applying the linear searching in the array list */

        Collections.reverse(list);

        System.out.println("After reversing the list: "+list);

        System.out.println();
        System.out.println(list);

        /* Calling the method */
        Experiment();

        System.out.println(Collections.max(list));

        /* Updating by  */
        list.set(5, 555);
        System.out.println(list);
    }

    public static void Experiment(){
        ArrayList <String> demo = new ArrayList<>();

        demo.add("Germany");
        demo.add("India");
        demo.add("America");
        demo.add("Netherland");

        Collections.reverse(demo);
        System.out.println("After reversing the string array: "+demo);


    }
}