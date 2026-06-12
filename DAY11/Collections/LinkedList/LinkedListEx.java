package DAY11.Collections.LinkedList;

import java.util.*;
public class LinkedListEx {
    public static void main(String[] args){
        LinkedList<Integer> marks = new LinkedList<>();

        marks.addFirst(86);
        marks.addFirst(92);
        marks.addLast(90);
        marks.addLast(88);
        System.out.println(marks);

        marks.removeFirst();
        System.out.println(marks);

        marks.removeLast();
        System.out.println(marks);

        System.out.println("First Mark: " + marks.getFirst());
        System.out.println("Last Mark: " + marks.getLast());

        System.out.println("Size of Marks: " + marks.size());




    }
}
