package coreJavaPractice.day38_Practice.teacherTask;

import java.time.LocalDate;

public class Teacher {
    private String name, lastName;
    private char gender;
    private int age, ID;
    LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Teacher(String name, String lastName, char gender, int age, int ID,LocalDate dateOfBirth) {
        setName(name);
        setLastName(lastName);
        setGender(gender);
        setAge(age);
        setID(ID);
        setDateOfBirth(dateOfBirth);
    }



    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
