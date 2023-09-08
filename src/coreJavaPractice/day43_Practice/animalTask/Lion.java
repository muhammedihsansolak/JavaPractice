package coreJavaPractice.day43_Practice.animalTask;

public final class Lion extends WildAnimal{

    public Lion(String name, String breed, String color, char gender, char size, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
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
    public void hunt(String pray) {
        System.out.println(getBreed()+" "+getName()+" is hunting "+pray);
    }

    public void roar(){
        System.out.println(getBreed()+" "+getName()+" is roaring");
    }
}
