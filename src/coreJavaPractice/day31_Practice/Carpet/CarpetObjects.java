package coreJavaPractice.day31_Practice.Carpet;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(10, 14.5, 0.95, false);
        Carpet carpet2 = new Carpet(15,20,0.80,false);
        Carpet carpet3 = new Carpet(5,6.3,1.55,true);

        ArrayList<Carpet> list = new ArrayList<>(Arrays.asList(carpet1,carpet2,carpet3));

        for (Carpet carpet : list) {
            System.out.println(carpet.calcCost());
        }

    }


}
