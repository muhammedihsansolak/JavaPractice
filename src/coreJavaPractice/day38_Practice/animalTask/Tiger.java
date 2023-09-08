package coreJavaPractice.day38_Practice.animalTask;

public class Tiger extends Animal{
    public Tiger(String name, String breed, char gender) {
        super(name, breed, gender, 'L', "Orange-Black", false, true);
    }

    @Override
    void eat() {
        System.out.println(name+" eats deer");
    }
}
