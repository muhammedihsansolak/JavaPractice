package coreJavaPractice.day43_Practice.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog("Thor","American Staff","Brown",'M','M',2,false,true,true);
        Lion lion = new Lion("King","African Lion","Orange",'M','L',5,true,false,false);

        System.out.println(dog);
        System.out.println(lion);


        dog.drink("Water");

        dog.move();

        lion.hunt("deer");

        lion.roar();



    }
}
