package day39_Practice.Animal;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age, false, true, false);
    }
    public void eat(String food) {
        System.out.println(getBreed()+" "+getName()+" loves to eat "+food);
    }
    public void sing(String song){
        System.out.println(getBreed()+" "+getName()+" is singing "+song);
    }
}
