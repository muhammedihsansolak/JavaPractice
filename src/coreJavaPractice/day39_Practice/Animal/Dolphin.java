package coreJavaPractice.day39_Practice.Animal;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age, false, true, false);
    }

    @Override
    public void eat(String food) {
        System.out.println(getBreed()+" "+getName()+" loves to eat "+food);
    }

    public void swim(){
        System.out.println(getBreed()+" "+getName()+" is swimming");
    }
}
