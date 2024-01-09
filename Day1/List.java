import java.util.*;

public class List1 {

    public static void main(String args[]) {
        List<String> fruits = new ArrayList<>();  
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
