package day08_Practice;

public class MultiBranchIf {

    public static void main(String[] args) {

        int score = 75;
        char grade;//Grade: A, B, C, D, F

        if (score >=90 ){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        }else if (score>=70) {
            grade = 'C';
        }else if (score >= 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);
    }
}
