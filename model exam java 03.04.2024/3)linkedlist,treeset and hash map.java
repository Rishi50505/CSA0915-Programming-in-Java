import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Iterator;

public class Java {
    public static void main(String[] args) {
        System.out.println("LinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        Iterator<String> itr1 = linkedList.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("\nTreeSet Example:");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);
        Iterator<Integer> itr2 = treeSet.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println("\nHashMap Example:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
