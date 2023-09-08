package coreJavaPractice.day38_Practice.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, char size, String color) {
        super(name, breed, gender, 'M', color, true, false);
    }

    @Override
    void eat() {
        System.out.println(name+" eats cat food");
    }
}
