package DAY13.Queue;
import java.util.*;
public class App {
    public static void main (String[] args){

        Queue<String> TicketsLine = new LinkedList<>();


        TicketsLine.offer("Swaraj");
        TicketsLine.offer("Satya");
        TicketsLine.offer("Vansh");
        TicketsLine.offer("Shlok");


        System.out.println(TicketsLine);

        System.out.println(TicketsLine.peek());

        System.out.println(TicketsLine.poll());

        System.out.println(TicketsLine);

        System.out.println(TicketsLine.size());

    }
}
