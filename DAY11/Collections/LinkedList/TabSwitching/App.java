package DAY11.Collections.LinkedList.TabSwitching;

public class App {

    public static void main(String[] args) {

        TabFunc tabFunc = new TabFunc();

        tabFunc.visitPage("www.google.com");
        tabFunc.visitPage("www.facebook.com");
        tabFunc.visitPage("www.twitter.com");

        tabFunc.displayHistory();

        tabFunc.goForward();

        tabFunc.goBack();

        tabFunc.goForward();

        tabFunc.displayHistory();
    }
}