package coreJavaPractice.day36_Practice.cryptoToken;

public class MyWallet {
    public static void main(String[] args) {

        BTC btc = new BTC();
        btc.setInfo(28051.20 , 1.34,542016086,274985394,193618262,false);

        System.out.println(btc);
        System.out.println(btc.totalPrice());
    }
}
