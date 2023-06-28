package day39_Practice.Device;

public class MyDevices {

    public static void main(String[] args) {


        Samsung samsung = new Samsung("Galaxy S 8 Plus",850);
        Nokia nokia = new Nokia("8",1299);

        Laptop laptop = new Laptop("Acer","Swift",1000);
        TV tv = new TV("Beko", "TV+",1250);

        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(laptop);
        System.out.println(tv);

    }
}
