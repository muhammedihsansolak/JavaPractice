package coreJavaPractice.day38_Practice.teacherTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class School {

    static Teacher t1;
    static Teacher t2;
    static Teacher t3;
    static Teacher t4;
    static {
        t1  = new Teacher("Maxwell", "Ian", 'M',24,69, LocalDate.of(1999,1,31));
        t2 = new Teacher("Yuliya","Yıgt", 'F',25,70, LocalDate.of(1997,5,31));
        t3 = new Teacher("Alex","Dries", 'M',30,71, LocalDate.of(1993,8,26));
        t4 = new Teacher("Mary", "Mic", 'F', 56,48, LocalDate.of(1967,11,24));
    }

    public static void main(String[] args) {

        Teacher[] teachers = {t1,t2,t3,t4};
        ArrayList<Teacher> result1 = returnLastIfStartM(teachers);
        System.out.println(result1);
        System.out.println("** ** ** ** ** ** ** ** ** ** ** ** **");
        ArrayList<Teacher> result2 = returnFemaleTeachers(teachers);
        System.out.println(result2);
        System.out.println("** ** ** ** ** ** ** ** ** ** ** ** **");
        ArrayList<Teacher> result3 = returnLessThan30(teachers);
        System.out.println(result3);
        System.out.println("** ** ** ** ** ** ** ** ** ** ** ** **");
        ArrayList<Teacher> result4 = returnLessThan1967(teachers);
        System.out.println(result4);

    }
    static ArrayList<Teacher> returnLastIfStartM(Teacher[] teachers){
        ArrayList<Teacher> list = new ArrayList<>();
        for (Teacher each : teachers) {
            if (each.getLastName().startsWith("M")){
                list.add(each);
            }
        }
        return list;
    }
    static ArrayList<Teacher> returnFemaleTeachers(Teacher[] teachers){
        ArrayList<Teacher> list = new ArrayList<>();
        for (Teacher each : teachers) {
            if (each.getGender() == 'F'){
                list.add(each);
            }
        }
        return list;
    }
    static ArrayList<Teacher> returnLessThan30(Teacher[] teachers){
        ArrayList<Teacher> list = new ArrayList<>();
        for (Teacher each : teachers) {
            if (each.getAge() < 30){
                list.add(each);
            }
        }
        return list;
    }
    static ArrayList<Teacher> returnLessThan1967(Teacher[] teachers){
        ArrayList<Teacher> list = new ArrayList<>();
        for (Teacher each : teachers) {
            if (each.getDateOfBirth().getYear() <= 1967){
                list.add(each);
            }
        }
        return list;
    }
}
