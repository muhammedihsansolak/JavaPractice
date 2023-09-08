package coreJavaPractice.day35_Practice.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candyArrayList = new ArrayList<Candy>();

        Candy c1 = new Candy("AA", 100, 0.50, false);
        Candy c2 = new Candy("BB", 75, 1, true);
        Candy c3 = new Candy("CC", 125, 0.65, false);
        Candy c4 = new Candy("DD", 150, 0.35, false);
        Candy c5 = new Candy("EE", 50, 1.15, true);

        candyArrayList.addAll(Arrays.asList(c1,c2,c3,c4,c5));
        for (Candy each : candyArrayList) {
            System.out.println(each.getBrand()+" -> $"+each.getPrice());
        }
    }
}
