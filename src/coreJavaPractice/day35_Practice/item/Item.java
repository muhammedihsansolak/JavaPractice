package coreJavaPractice.day35_Practice.item;

import static java.lang.Character.*;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Name can not be empty");
            return;
        } else if (!isLetter(name.charAt(0))) {
            System.err.println("Name has to start with letter");
            return;
        }
        char[] arr = name.toCharArray();
        for (char each : arr) {
            if (!(isLetterOrDigit(each) || each == ' ')) {
                System.err.println("name can not contain any special characters other than space");
                return;
            }
        }


        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {

            return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            return;
        } if (name.equalsIgnoreCase("toilet paper")){
            if (quantity>1){
                return;
            }
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=$" + calcCost() +
                '}';
    }
}
