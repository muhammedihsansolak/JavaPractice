package day39_Practice.phoneTask;

public class PhoneStore {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro Max","Black", 6.5,1990);
        System.out.println(iphone);

        iphone.call("05537293101");
        iphone.faceTime("05537293101");

        Samsung samsung = new Samsung("A8","White",7.2,1699);
        System.out.println(samsung);
        samsung.freeze();

        Nokia nokia = new Nokia("S5","Black",7.5,1350);
        System.out.println(nokia);
        nokia.selfDefense();
        System.out.println(nokia);

    }
}
