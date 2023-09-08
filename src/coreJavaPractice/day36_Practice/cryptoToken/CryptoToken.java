package coreJavaPractice.day36_Practice.cryptoToken;

public class CryptoToken {
    double price, quantity,marketCap,volume,circulatingSupply;
    boolean isMineable;

    public void setInfo(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=$" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
     double totalPrice(){
        return price* quantity;
    }
}
