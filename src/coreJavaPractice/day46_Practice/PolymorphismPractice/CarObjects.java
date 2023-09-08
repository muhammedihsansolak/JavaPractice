package coreJavaPractice.day46_Practice.PolymorphismPractice;

import coreJavaPractice.day46_Practice.carTask.BMW;
import coreJavaPractice.day46_Practice.carTask.Car;
import coreJavaPractice.day46_Practice.carTask.Tesla;
import coreJavaPractice.day46_Practice.carTask.Toyota;

import java.util.ArrayList;

public class CarObjects {

    public static void main(String[] args) {

        Car[] cars = {
            new BMW("i3",2019,45000,"Black",34000),
                    new BMW("i4",2021,45000,"Black",34000),
            new Tesla("Model 3",2023,125000,"Red",2000),
                    new Tesla("Model S",2016,125000,"Red",2000),
            new Toyota("Camry", 2018, 30000, "Red", 185000),
                    new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Camry", 2010, 30000, "Red", 185000),
        };

        ArrayList<Car> recalled = new ArrayList();

        for (Car each : cars) {

            if (each.getClass().getSimpleName().equals("BMW") && each.year <= 2023 && each.year>=1929){
                recalled.add(each);
            }
            if (each.getClass().getSimpleName().equals("Tesla") && each.year <= 2016 && each.year>=2015){
                recalled.add(each);
            }
            if (each.getClass().getSimpleName().equals("Toyota") && each.year <= 2011 && each.year>=2010){
                recalled.add(each);
            }
        }
        System.out.println(recalled);

        System.out.println("==========================================");

        Car highestMileage = cars[0];
        for (Car each : cars) {
            if (each.miles > highestMileage.miles) highestMileage = each;
        }
        System.out.println("Highest Mileage = "+ highestMileage.year+" "+ highestMileage.brand+" "+highestMileage.model+" "+highestMileage.miles+" Km.");

        System.out.println("==========================================");

        Car lowestMileage = cars[0];
        for (Car each : cars) {
            if (each.miles < lowestMileage.miles) lowestMileage = each;
        }
        System.out.println("Lowest Mileage = "+ lowestMileage.year+" "+ lowestMileage.brand+" "+lowestMileage.model+" "+lowestMileage.miles+" Km.");



    }
}
