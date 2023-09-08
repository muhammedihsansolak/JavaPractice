package coreJavaPractice.day38_Practice.animalTask;

public class Eagle extends Animal{
    public Eagle(String name, String breed, char gender, String color) {
        super(name, breed, gender, 'M', color, false, true);
    }

    @Override
    void eat() {
        System.out.println(name+" eats snake");
    }
}
