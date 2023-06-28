package day39_Practice.Device;

public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery, hasPowerButton;





    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }




    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.err.println("Invalid brand");
            return;
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.err.println("Invalid model");
            return;
        }
        this.model = model;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price");
            return;
        }
        this.price = price;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(getBrand()+" "+getModel()+" has turned on");
    }
    public void turnOff(){
        System.out.println(getBrand()+" "+getModel()+" has turned off");
    }




    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
