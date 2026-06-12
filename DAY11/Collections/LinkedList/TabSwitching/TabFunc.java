package DAY11.Collections.LinkedList.TabSwitching;
import java.util.LinkedList;

public class TabFunc {

    LinkedList<String> backHistory = new LinkedList<>();
    LinkedList<String> forwardHistory = new LinkedList<>();

    String currentPage = null;

    void visitPage(String url) {

        if(currentPage != null){
            backHistory.addLast(currentPage);
        }

        currentPage = url;
        forwardHistory.clear();

        System.out.println("Visited: " + url);
    }

    void goBack() {

        if(backHistory.isEmpty()){
            System.out.println("No previous page.");
            return;
        }

        forwardHistory.addLast(currentPage);
        currentPage = backHistory.removeLast();

        System.out.println("Current page: " + currentPage);
    }

    void goForward() {

        if(forwardHistory.isEmpty()){
            System.out.println("No forward page.");
            return;
        }

        backHistory.addLast(currentPage);
        currentPage = forwardHistory.removeLast();

        System.out.println("Current page: " + currentPage);
    }

    void displayHistory() {

        System.out.println("Back History : " + backHistory);
        System.out.println("Current Page : " + currentPage);
        System.out.println("Forward History : " + forwardHistory);
    }
}