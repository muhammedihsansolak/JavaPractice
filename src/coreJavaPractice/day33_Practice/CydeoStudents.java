package coreJavaPractice.day33_Practice;

public class CydeoStudents {

    //static variables ==>
    public static String schoolName = "Cydeo School", programmingLanguage = "Java";
    //instance variables ==>
    public String name;
    public char gender, grade;
    public int age,ID,batchNumber,groupNumber;

    //constructor ==>
    public CydeoStudents(String name, char gender, char grade, int age, int ID, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    //instance methods
    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+" has attended the class");
    }

    //print methods ==>
    public static void printSchoolName(){
        System.out.println("School: "+schoolName);
    }
    public static void printProgrammingLanguage(){
        System.out.println("Programming language is: "+programmingLanguage);
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public static void main(String[] args) {

        CydeoStudents student1 = new CydeoStudents("Maxwell Ian",'M','A',24,8845,11,7);
        CydeoStudents student2 = new CydeoStudents("Hülya",'F','A',25,3465,12,4);

        printSchoolName();
        printProgrammingLanguage();
        student1.attendClass();
        student2.study();
        System.out.println(student1);
        System.out.println(student2);

    }
}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */