package DAY11.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class App {
    public static void main(String[] args) {
        
        List<String> students = new ArrayList<>();
        students.add("Swaraj");
        students.add("Satya");
        students.add("Kaustubh");
        students.add("Sholk");
        students.add("Kuku");


        for (String student : students) {
            if(student.equals("Kaustubh")){
                System.out.println("Found Kaustubh");
                System.out.println("Index of Kaustubh is: " + students.indexOf(student));
            }
            
        }

        students.add(2, "pokemon");

        System.out.println("After adding pokemon at index 2: " + students);

        System.out.println("Element at index 3: " + students.get(3));

        students.set(2, "Sholk");
        System.out.println("After setting Sholk at index 2: " + students);

        System.out.println("Removed element: " + students.remove(2));
        System.out.println("After removing element at index 2: " + students);


        System.out.println("Contains 'Sholk': " + students.contains("Sholk"));

        System.out.println("Size of the list: " + students.size());


        // students.clear();
        // System.out.println(students.isEmpty());


        Collections.sort(students);
        System.out.println("Sorted: " + students);

        Collections.reverse(students);
        System.out.println("Reverse: " + students);


    }
}
