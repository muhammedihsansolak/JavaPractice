package day39_Practice.studentTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, String studentID, String schoolName, String fieldOfStudy, char grade) {
        super(name, age, gender, studentID, schoolName, fieldOfStudy, grade);
    }

    @Override
    void study() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is studying");
    }
}
