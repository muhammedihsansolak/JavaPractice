package day43_Practice.animalTask;

public abstract class Animal {

    private final String name, breed, color;
    private final char gender, size;
    private final int age;

    public Animal(String name, String breed, String color, char gender, char size, int age) {
        if (name.isEmpty() || name.isBlank()) throw new RuntimeException("Invalid name: "+name);
        this.name = name;
        if (breed.isEmpty() || breed.isBlank()) throw new RuntimeException("Invalid breed: "+breed);
        this.breed = breed;
        if (color.isEmpty() || color.isBlank()) throw new RuntimeException("Invalid color: "+color);
        this.color = color;
        if ( ! ( gender == 'M' || gender=='F' ) ) throw new RuntimeException("Invalid gender: "+gender);
        this.gender = gender;
        if ( ! ( size == 'S' || size=='M' || size=='L' ) ) throw new RuntimeException("Invalid size: "+size);
        this.size = size;
        if (age<=0) throw new RuntimeException("Invalid age: "+age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public char getSize() {
        return size;
    }

    public int getAge() {
        return age;
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

    public abstract void eat(String food);
    public abstract void drink(String drink);
    public abstract void sleep();
    public abstract void move();
}
