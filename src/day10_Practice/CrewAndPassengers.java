package day10_Practice;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int number = 66;
        String result = "";

        if ((number == 50) || (number == 75) || (number == 100)) {

            result = (number == 100) ? "Total: 100 ====> 30 crew, 70 passengers " : (number == 75) ? "Total: 75  ====> 25 crew, 50 passengers"
                    : (number == 50) ? "Total: 50  ====> 20 crew, 30 passengers" : "";
        }else {
          result =  "Any other number of people on the ship is not valid" ;
        }
        System.out.println(result);
    }
}
/*
Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */