package day38_Practice.animalTask;

public class Animals {
    public static void main(String[] args) {

        Cat cat = new Cat("Çorap", "tekir", 'F', 'M', "Grey-White");
        Dog dog = new Dog("Max", "American Staffordshire Terrier", 'M', 'M', "Brown-White", true, true);
        Tiger tiger = new Tiger("Tiger", "Bengal tiger", 'M');
        Eagle eagle = new Eagle("Eagle","Ankara eagle",'F',"Black-White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(tiger);
        System.out.println(eagle);

        cat.eat();
        dog.eat();
        tiger.eat();
        eagle.eat();


    }
}
