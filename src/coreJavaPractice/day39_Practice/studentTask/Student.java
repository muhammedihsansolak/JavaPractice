package coreJavaPractice.day39_Practice.studentTask;

public class Student extends Person {

    private String studentID, schoolName, fieldOfStudy;
    private char grade;
    public Student(String name, int age, char gender, String studentID,String schoolName,String fieldOfStudy, char grade) {
        super(name, age, gender);
        this.studentID = studentID;
        setSchoolName(schoolName);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank() ){
            System.err.println("Invalid");
            return;
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if ( schoolName == null || schoolName.isEmpty() ){
            System.err.println("Invalid");
            return;
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if ( ! (grade =='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F') ) {
                System.err.println("Invalid");
                return;
            }
        this.grade = grade;
    }

    @Override
    public void eat(String food) {
        System.out.println(fieldOfStudy+" student "+getName()+" is eating "+food);
    }

    @Override
    public void drink() {
        System.out.println(fieldOfStudy+" student "+getName()+" is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(fieldOfStudy+" student "+getName()+" is sleeping");
    }

    void study(){
        System.out.println(fieldOfStudy+" student "+getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID='" + studentID + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                '}';
    }
}
