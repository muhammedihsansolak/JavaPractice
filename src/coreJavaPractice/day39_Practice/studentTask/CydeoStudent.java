package coreJavaPractice.day39_Practice.studentTask;

public class CydeoStudent extends Student{

    private int batchNum, groupNum;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentID, String schoolName, String fieldOfStudy, char grade, int batchNum, int groupNum, String programmingLanguage) {
        super(name, age, gender, studentID, schoolName, fieldOfStudy, grade);
        setBatchNum(batchNum);
        setGroupNum(groupNum);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {
        if (batchNum<=0) return;
        this.batchNum = batchNum;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        if (groupNum<=0) return;
        this.groupNum = groupNum;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty()) return;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID='" + getStudentID() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", batchNum=" + batchNum +
                ", groupNum=" + groupNum +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    @Override
    public void eat(String food) {
        System.out.println(getFieldOfStudy()+" student "+getName()+" is eating "+food);
    }

    @Override
    public void drink() {
        System.out.println(getFieldOfStudy()+" student "+getName()+" is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(getFieldOfStudy()+" student "+getName()+" is sleeping");
    }
}
