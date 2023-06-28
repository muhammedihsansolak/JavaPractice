package day43_Practice.animalTask;

public final class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String color, char gender, char size, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, size, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat(String food) {
        System.out.println(getBreed()+" "+getName()+" is eating "+food);
    }

    @Override
    public void drink(String drink) {
        System.out.println(getBreed()+" "+getName()+" is drinking "+drink);
    }

    @Override
    public void sleep() {
        System.out.println(getBreed()+" "+getName()+" is sleeping");
    }

    @Override
    public void move() {
        System.out.println(getBreed()+" "+getName()+" is moving");
    }

    @Override
    public void play() {
        System.out.println(getBreed()+" "+getName()+" is playing");
    }

    @Override
    public void pet() {
        System.out.println(getBreed()+" "+getName()+" is a lovely pet");
    }

    public void bark(){
        System.out.println(getBreed()+" "+getName()+" is barking");
    }
}
