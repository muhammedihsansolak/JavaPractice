package coreJavaPractice.day09_Practice;
public class CampusTime2 {

    public static void main(String[] args) {

        int time = 7;    //1-24
        String result;

        if (time > 0 && time < 25) {
            if (time >= 8 && time <= 23) {
                result = "Open";
            } else {
                result = "Closed";
            }
            System.out.println(result);
        } else {
            System.out.println("Incorrect entry.");
        }

    }
}
