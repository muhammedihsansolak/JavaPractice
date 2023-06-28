package day38_Practice.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, char size, String color, boolean isCute, boolean isDangerous) {
        super(name, breed, gender, size, color, isCute, isDangerous);
    }

    @Override
    void eat() {
        System.out.println(name+" eats dog food");
    }
}
