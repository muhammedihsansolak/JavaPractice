package day39_Practice.Animal;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age, false, true, true);
    }

    @Override
    public void eat(String food) {
        System.out.println(getBreed()+" "+getName()+" loves to eat meat and "+ food);
    }
    public void bark(){
        System.out.println(getBreed()+" "+getName()+" is barking");
    }
}
