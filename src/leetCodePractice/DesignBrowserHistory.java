package leetCodePractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class DesignBrowserHistory {
    Deque<String> history;
    Deque<String> forward;
    String currentUrl;

    public DesignBrowserHistory(String homepage) {
        currentUrl = homepage;
        this.history = new ArrayDeque<>();
        this.forward = new ArrayDeque<>();
    }

    public void visit(String url) {
        history.push(currentUrl);
        currentUrl = url;
        forward.clear();
    }

    public String back(int steps) {

        while (! history.isEmpty() && steps > 0 ){

            forward.push(currentUrl);
            currentUrl = history.pop();
            steps--;
        }
        return currentUrl;
    }

    public String forward(int steps) {

        while (! forward.isEmpty() && steps > 0){

            history.push(currentUrl);
            currentUrl = forward.pop();
            steps--;
        }

        return currentUrl;
    }

}
/*
You have a browser of one tab where you start on the homepage and you can visit another currentUrl, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string currentUrl) Visits currentUrl from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current currentUrl after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current currentUrl after forwarding in history at most steps.
 */