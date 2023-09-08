package coreJavaPractice.day38_Practice.animalTask;

public class Animal {
    String name, breed, color;
    char gender, size;
    boolean isCute, isDangerous;

    public Animal(String name, String breed, char gender, char size, String color, boolean isCute, boolean isDangerous) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.isCute = isCute;
        this.isDangerous = isDangerous;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", is cute=" + isCute +
                ", is dangerous=" + isDangerous +
                '}';
    }

    void eat() {
    }
}
