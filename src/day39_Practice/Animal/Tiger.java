package day39_Practice.Animal;

public class Tiger extends WildAnimal {

    public Tiger(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age, true, false, false);
    }
    public void hunt(String pray) {
        System.out.println(getBreed()+" "+getName()+" is hunting "+pray);
    }
}
