package coreJavaPractice.day39_Practice.studentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, String studentID, String schoolName, String fieldOfStudy, char grade) {
        super(name, age, gender, studentID, schoolName, fieldOfStudy, grade);
    }

    @Override
    void study() {
        System.out.println(getClass().getSimpleName()+" is studying");
    }
}
