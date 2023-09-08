package coreJavaPractice.day31_Practice.Carpet;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unit price= $" + unitPrice +
                ", is Persian=" + isPersian +
                ", cost= $" + calcCost() +
                '}';
    }

    public double calcCost(){
        double cost= (width*length)*unitPrice;
        return (isPersian)? cost+200 : cost;
    }



}
