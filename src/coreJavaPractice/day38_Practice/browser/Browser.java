package coreJavaPractice.day38_Practice.browser;

public class Browser {

    String name;

    public Browser(String name) {
        this.name = name;
    }

    public String toString() {
        return "Browser{" +
                "name='" + name + '\'' +
                '}';
    }

    void openBrowser(){
        System.out.println("Opening "+name+" browser");
    }
    void closeBrowser(){
        System.out.println("Closing "+name+" browser");
    }
}
