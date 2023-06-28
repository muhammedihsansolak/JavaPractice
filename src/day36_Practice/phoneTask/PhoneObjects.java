package day36_Practice.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone  iphone = new Iphone();
        iphone.setInfo("Apple","11 Pro",'L',2300,"White");
        iphone.faceTime("cydeo@school.com");
        iphone.text(346346245);
        System.out.println(iphone);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","A5",'M',1350,"Blue");
        samsung.freeze();
        System.out.println(samsung);
    }
}
