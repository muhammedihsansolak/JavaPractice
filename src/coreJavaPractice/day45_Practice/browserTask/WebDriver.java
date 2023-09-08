package coreJavaPractice.day45_Practice.browserTask;

public interface WebDriver extends SearchContext{


    public abstract void get(String url);
    public abstract void close();
    public abstract void quit();
    public abstract void getTitle();
}
