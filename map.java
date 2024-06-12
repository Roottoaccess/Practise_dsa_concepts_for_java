import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class map {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();

        map.put("Biswarup Dutta", 112);

        map.put("Jeet", 104);

        map.put("Jeet", 104);

        System.out.println(map);

        System.out.println(map.get("Jeet"));


        map.putIfAbsent("HackerGriffen", 101);

        System.out.println(map);

        /* Calling the treeMap */
        Engine();
    }

    public static void Engine(){
        Map <String , Integer> e1 = new TreeMap<>();

        e1.put("Biswarup Dutta", 112);

        e1.put("Jeet", 104);

        e1.put("Jeet", 104);

        e1.putIfAbsent("HackerGriffen", 101);

        System.out.println(e1);
    }
}
