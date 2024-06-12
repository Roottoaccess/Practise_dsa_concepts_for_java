import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack <String> animals = new Stack<>();

        /* Stack works on the principle of LIFO */
        /* Inserting the values */
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Elephant");

        System.out.println(animals);

        System.out.println();

        /* REmoving the values */
        animals.pop();
        System.out.println(animals);
    }
}
