package day39_Practice.Animal;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Çorap","Tekir","Gray-White",'F','S',1);
        cat.meow();
        cat.eat("Tuna");
        System.out.println(cat);

        Dog dog = new Dog("Frederick","Chow Chow","Brown",'M','M',2);
        dog.eat("bone");
        dog.bark();
        dog.play();
        System.out.println(dog);

        Lion lion = new Lion("King","African lion","Brown",'M','L',9);
        lion.hunt("deer");
        lion.drink("water");
        System.out.println(lion);

    }
}
