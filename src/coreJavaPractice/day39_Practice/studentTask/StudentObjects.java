package coreJavaPractice.day39_Practice.studentTask;

public class StudentObjects {

    public static void main(String[] args) {

        CydeoStudent c1 = new CydeoStudent("Meryem",10,'F',"4546","Cydeo","Developer",'A',11,7,"Java");
        System.out.println(c1);
        c1.drink();
        c1.eat("Döner");

        c1.sleep();

        GraduateStudent g1 = new GraduateStudent("Muhammed",24,'M',"1243","Cydeo","Sdet",'A');
        System.out.println(g1);

        g1.study();

        UndergraduateStudent u1 = new UndergraduateStudent("Ömer",22,'M',"4232","Cydeo","QA",'B');
        System.out.println(u1);

    }
}
