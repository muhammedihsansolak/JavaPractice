package day33_Practice;

public class Dog {

    public String breed, size, color;
    public char gender;
    public double age;

    public static int numberOfLegs = 4, numberOfEyes = 2;
    public static boolean hasWings = false, isFriendly = true;

    public Dog(String breed, String size, String color, char gender, double age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(breed+" is eating");
    }
    public void sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(){
        System.out.println(breed+" is playing");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", has wings=" + hasWings +
                ", is friendly= very " + isFriendly + " :) "+
                '}';
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("American Staffordshire Terrier","Medium","Brown-White",'M',2.5);

        myDog.eat();
        myDog.sleep();
        System.out.println(myDog);

    }
}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()

 */