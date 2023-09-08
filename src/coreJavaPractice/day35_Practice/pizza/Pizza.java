package coreJavaPractice.day35_Practice.pizza;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (!(size == 'S' || size == 'M' || size == 'L')) {
            System.err.println("Invalid size");
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping(){
        return numberOfCheeseTopping;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping){
        if (numberOfCheeseTopping<0){
            return;
        }
        if (size=='S'&&numberOfCheeseTopping>3){
            this.numberOfCheeseTopping = 3;
            return;
        }
        if (size=='M'&&numberOfCheeseTopping>4){
            this.numberOfCheeseTopping = 4;
            return;
        }
        if (size=='L'&&numberOfCheeseTopping>5){
            this.numberOfCheeseTopping = 5;
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping(){
        return numberOfPepperoniTopping;
    }
    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping){
        if (numberOfPepperoniTopping<0){
            return;
        }
        if (size=='S'&&numberOfPepperoniTopping>4){
            this.numberOfPepperoniTopping = 4;
            return;
        }
        if (size=='M'&&numberOfPepperoniTopping>5){
            this.numberOfPepperoniTopping = 5;
            return;
        }
        if (size=='L'&&numberOfPepperoniTopping>6){
            this.numberOfPepperoniTopping = 6;
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public double calcCost(){
        double result = 0;
        result = (size=='S')? 10+(numberOfCheeseTopping*2)+(numberOfPepperoniTopping*2) :(size=='M')? 12+(numberOfCheeseTopping*2)+(numberOfPepperoniTopping*2) :(size=='L')? 14+(numberOfCheeseTopping*2)+(numberOfPepperoniTopping*2) : 0;
        return result;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=$" + calcCost() +
                '}';
    }
}
