package day46_Practice.employee;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeps 6 hours");
    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }

}
