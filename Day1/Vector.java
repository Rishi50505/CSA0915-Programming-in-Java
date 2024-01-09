import java.util.Vector;

public class vector {  

    public static void main(String[] args) {  
        Vector<String> names = new Vector<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
