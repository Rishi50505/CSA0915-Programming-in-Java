import java.util.HashSet;

public class HashSetExample {  

    public static void main(String[] args) { 
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(4);
        uniqueNumbers.add(2);
        uniqueNumbers.add(4); 

        boolean containsFive = uniqueNumbers.contains(5);  

        System.out.println("HashSet elements: " + uniqueNumbers);
    }
}
