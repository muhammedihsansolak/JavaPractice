package day39_Practice.Animal;

public class Animal {

    private String name, breed, color;
    private char gender, size;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name.isBlank() || name.isEmpty() || name.equals(null))) return;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if ((name.isBlank() || name.isEmpty() || name.equals(null))) return;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ((name.isBlank() || name.isEmpty() || name.equals(null))) return;
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) return;
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (!(size == 'S' || size == 'M' || size == 'L')) return;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) return;
        this.age = age;
    }

    public Animal(String name, String breed, String color, char gender, char size, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setGender(gender);
        setSize(size);
        setAge(age);
    }

    public void eat(String food){
        System.out.println(getBreed()+" "+getName()+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(getBreed()+" "+getName()+" is drinking "+drink);
    }
    public void sleep(){
        System.out.println(getBreed()+" "+getName()+" is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
