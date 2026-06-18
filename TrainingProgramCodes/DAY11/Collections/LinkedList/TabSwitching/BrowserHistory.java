package DAY11.Collections.LinkedList.TabSwitching;
import java.util.*;

public class BrowserHistory {

    LinkedList<String> History = new LinkedList<>();
    LinkedList<String> Forward = new LinkedList<>();

    public void visitPage(String page){
        History.addLast(page);
        Forward.clear();
        System.out.println(page + " is visited.");
        
    }

    public void goBack(){
        if(History.size()<=1){
            System.out.println("No previous page available.");
        }
        String currentPage = History.removeLast();
        Forward.addFirst(currentPage);
        System.out.println("Now your current page is: " + History.getLast());

    }

    public void goForward(){

        if(Forward.isEmpty()){
            System.out.println("No forward page available.");
        }

        String nextPage = Forward.removeFirst();
        History.addLast(nextPage);
        System.out.println("Now your current page is: " + nextPage);
    }

    public void displayHistory(){
        if(History.isEmpty()){
            System.out.println("No browsing history available.");
        }

        System.out.println("Browsing History:");
        for(String st : History){
            System.out.println(st);
        }
        
    }

    void printCurrentPage(){
        if(History.isEmpty()){
            System.out.println("No current page available.");
        }
        System.out.println("Current page: " + History.getLast());
    }

    void clearHistory(){
        if(History.isEmpty()){
            System.out.println("No browsing history to clear.");
        }

        History.clear();
        Forward.clear();
        System.out.println("Browsing history cleared.");
    }

}