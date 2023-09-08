package coreJavaPractice.day35_Practice.carpet;

public class Carpet {

    private double width, length, unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean getIsPersian() {
        return isPersian;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid value");
            return;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid value");
            return;
        }
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            System.err.println("Invalid value");
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean isPersian) {
        this.isPersian = isPersian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double calcCost() {
        double result = 0;
        result = (!isPersian) ? width * length * unitPrice : width * length * unitPrice + 200;
        return result;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
