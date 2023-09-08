package coreJavaPractice.day09_Practice;

public class SalaryAfterTax2 {

    public static void main(String[] args) {
        double salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0 ;

        if(salary>= 130000 ){ //false: salary < 130000;
            taxRate = 0.35; //35%
        }else if(salary>= 100000 ){ //false: salary < 100000;
            taxRate = 0.30; //30%
        }else if(salary>= 80000 ){ //false: salary < 80000
            taxRate = 0.25; //25%
        }else {
            taxRate = 0.20; //20%
        }


        if (isMarried){ // if the person is married
            taxRate -= 0.05; // subtracting 5% from the original tax rate
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);

    }
}
