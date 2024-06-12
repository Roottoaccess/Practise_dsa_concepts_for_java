import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class set {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();

        /* HashSet will only accept unique values */
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(54);

        System.out.println(set);

        /* To removing the value we can use */
        set.remove(21);

        System.out.println(set);

        /* Traversing through the set */
        for(int i: set){
            System.out.print(i+" ");
        }

        System.out.println(set.contains(65));

        System.out.println("Set is Empty: "+set.isEmpty());

        /* Displaying the hashcode */
        System.out.println("The hashCode: "+set.hashCode());

        /* Calling the Engine1 method */
        Engine1();

        /* Calling the Engine2 method */
        Engine2();
    }

    public static void Engine1(){
        /* For the order Set we use Linked Hash set */
        Set <Integer> st = new LinkedHashSet<>();

        st.add(32);
        st.add(2);
        st.add(54);
        st.add(21);
        st.add(65);
        st.add(54);

        System.out.println();
        System.out.println("This is the Linked Hash Set: "+st);
    }

    public static void Engine2(){
        /* For the sorted set we use Tree set for binary tree */

        Set <Integer> sts = new TreeSet<>();

        sts.add(32);
        sts.add(2);
        sts.add(54);
        sts.add(21);
        sts.add(65);
        sts.add(54);

        System.out.println();
        System.out.println("This is the Tree Set for sorted order: "+sts);

        sts.add(28);

        System.out.println(sts);
    }
}