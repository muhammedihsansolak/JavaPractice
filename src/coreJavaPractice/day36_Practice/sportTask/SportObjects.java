package coreJavaPractice.day36_Practice.sportTask;

public class SportObjects {

    public static void main(String[] args) {

        Football football = new Football();
        football.setInfo("Football","You have 90 minutes",11,10);
        football.play();
        System.out.println(football);

        Basketball basketball = new Basketball();
        basketball.setInfo("Basketball", "You have 4 periods",5,20);
        basketball.play();
        System.out.println(basketball);

    }
}
