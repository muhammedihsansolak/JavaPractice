package day33_Practice;

public class Person {

    //instance variables -->
    public String name;
    public int age;
    public char gender;

    //static variables -->
    public static boolean isHuman = true, hasNose = true, hasWings = false;
    public static int numberOfHead = 1, numberOfEyes = 2;

    //constructor -->
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //methods ==>
    //instance methods -->
    public void eat(String food) {
        System.out.println(name + " is devouring " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return
                "Person{" +
                        "name = " + name +
                        ", age = " + age +
                        ", gender = " + gender + "}";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Maxwell Ian", 24, 'M');
        Person p2 = new Person("Hülya", 25, 'F');
        p1.eat("Oat");
        p2.sleep();
        System.out.println(p1+"\n\t\t ** -- ** -- ** -- \n"+p2);
    }
}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()

 */