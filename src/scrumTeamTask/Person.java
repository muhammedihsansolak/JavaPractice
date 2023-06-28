package scrumTeamTask;

public class Person {
    //instance variables
    private String name;
    private int age;
    private char gender;

    //-------GETTERS--------


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    //-------SETTERS---------


    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }


    //------CONSTRUCTOR-------

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }



    //----------toString-----------------


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    void eat(String food){

    }
    void drink(String drink){

    }

}
