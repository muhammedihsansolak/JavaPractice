package coreJavaPractice.day45_Practice.browserTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        EdgeDriver edgeDriver = new EdgeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        OperaDriver operaDriver = new OperaDriver();
        SafariDriver safariDriver = new SafariDriver();

        chromeDriver.executeScript("execute script");
        edgeDriver.findElement("find element");
        fireFoxDriver.takeScreenShot();






    }
}
