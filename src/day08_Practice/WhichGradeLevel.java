package day08_Practice;

public class WhichGradeLevel {
    /*
    Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School
     */
    public static void main(String[] args) {

        byte gradeLevel = 6;
        boolean elementarySchool = gradeLevel >= 1 && gradeLevel <= 5,
                middleSchool = gradeLevel >= 6 && gradeLevel <= 8,
                highSchool = gradeLevel >= 9 && gradeLevel <=12,
                college = gradeLevel>=13 && gradeLevel<=16,
                gradSchool = !elementarySchool && !middleSchool && !highSchool && !college;
        if (elementarySchool){
            System.out.println(gradeLevel + " grade level is \"elementary school\"");
        }
        if (middleSchool){
            System.out.println(gradeLevel + " grade level is \"middle school\"");
        }
        if (highSchool){
            System.out.println(gradeLevel + " grade level is \"high school\"");
        }
        if (college){
            System.out.println(gradeLevel + " grade level is \"college\"");
        }
        if (gradSchool){
            System.out.println(gradeLevel + " grade level is \"grad school\"");
        }


    }
}
