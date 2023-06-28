package day39_Practice.Animal;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age, false, true, true);
    }

    @Override
    public void eat(String food) {
        System.out.println(getBreed()+" "+getName()+" loves to eat cat food and "+ food);
    }
    public void meow(){
        System.out.println(getBreed()+" "+getName()+" is meowing");
    }
}
