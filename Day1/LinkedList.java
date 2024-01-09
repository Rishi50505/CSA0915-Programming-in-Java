import java.util.LinkedList;
public class List {
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();
        list.add("Mango");
        list.remove("Apple");
        list.remove("Banana");
        list.add("Cherry");

        for(String fruit:list)
            System.out.println(fruit);
        }    
    }


