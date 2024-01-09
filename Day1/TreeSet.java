import java.util.TreeSet;

public class Tree_Set { 

    public static void main(String[] args) {  
        TreeSet<String> sortedNames = new TreeSet<>();
        sortedNames.add("Charlie");
        sortedNames.add("Alice");
        sortedNames.add("Bob");

        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}