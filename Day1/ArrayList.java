import java.util.*;
public class Array{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.remove("Mango");
        System.out.println(list);
    }
}