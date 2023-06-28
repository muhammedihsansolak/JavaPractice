package day39_Practice.Animal;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age, true, false, false);
    }

    @Override
    public void hunt(String pray) {
        System.out.println(getBreed()+" "+getName()+" is hunting "+pray);
    }
}
