package DAY11.Collections.LinkedList.TabSwitching;

public class App {

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("www.google.com");
        browser.visitPage("www.facebook.com");
        browser.visitPage("www.youtube.com");
        browser.visitPage("www.twitter.com");

        browser.displayHistory();
        browser.printCurrentPage();
        browser.goBack();
        browser.goBack();
        browser.printCurrentPage();
        browser.goForward();
        browser.goForward();

        browser.clearHistory();
        browser.displayHistory();


    }
}