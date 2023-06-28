package day39_Practice.studentTask;

public class Person {

    //instance variables
    private String name;
    private int age;
    private char gender;
    public static boolean isHuman;

    //static block
    static {
        isHuman = true;
    }
    //setter and getter
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid");
            return;
        }
        for (char each : name.toCharArray()) {
            if (!Character.isWhitespace(each) && !Character.isLetterOrDigit(each)) {
                System.err.println("Invalid");
                return;
            }

        }

        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Invalid");
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("Invalid");
            return;
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
    //constructor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    //toString()
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    //instance method
    public void eat(String food) {

    }

    public void drink() {

    }

    public void sleep() {

    }
}
