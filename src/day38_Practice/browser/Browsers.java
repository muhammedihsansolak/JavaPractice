package day38_Practice.browser;

public class Browsers {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        Opera opera = new Opera();
        FireFox fireFox = new FireFox();
        Safari safari = new Safari();

        chrome.openBrowser();
        chrome.closeBrowser();
        System.out.println("** && ** && ** && ** &&");
        opera.openBrowser();
        opera.closeBrowser();
        System.out.println("** && ** && ** && ** &&");
        fireFox.openBrowser();
        fireFox.closeBrowser();
        System.out.println("** && ** && ** && ** &&");
        safari.openBrowser();
        safari.closeBrowser();
    }
}
