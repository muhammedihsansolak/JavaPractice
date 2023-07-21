package cydeoAlgorithmTasks;

public class AnimalFeast {

    public static void main(String[] args) {
        String name = "chickadee", dish = "chocolate cake";
        System.out.println(isValid(name, dish));
    }

    public static boolean isValid(String animalName, String dishName){
        return animalName.charAt(0) == dishName.charAt(0) && animalName.charAt(animalName.length() - 1) == dishName.charAt(dishName.length() - 1);
    }
}
