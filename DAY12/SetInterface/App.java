package DAY12.SetInterface;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added   
        System.out.println("Set: " + set);

        Set<Integer> intSet = new HashSet<>();

        intSet.add(11);
        intSet.add(2);
        intSet.add(3);
        intSet.add(1);
        intSet.add(2); // Duplicate, will not be added
        intSet.add(4); // Duplicate, will not be added
        System.out.println("Integer Set: " + intSet);

        
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(11);
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(1);
        linkedSet.add(2); // Duplicate, will not be added
        linkedSet.add(4);
        System.out.println("LinkedHashSet: " + linkedSet);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(11);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2); // Duplicate, will not be added
        treeSet.add(4);
        System.out.println("TreeSet: " + treeSet);


        set.remove("Banana");
        System.out.println("Set after removal: " + set);
        System.out.println("Set contains 'Apple': " + set.contains("Apple"));
        set.clear();
        System.out.println("Set after clearing: " + set);
        System.out.println("Set size: " + set.size());
        System.out.println("Set is empty: " + set.isEmpty());


        

    }
}
