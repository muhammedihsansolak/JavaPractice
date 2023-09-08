package coreJavaPractice.day22_Practice;

import java.util.Arrays;

public class ZombieAttack {

    public static void main(String[] args) {

        int[] inhabitants = {0, 7, 0, 24, 13, 0, 15, 7};

        int day = 0;
        System.out.println("Day "+ day +" " + Arrays.toString(inhabitants));

        int[] extinct = new int[inhabitants.length];

        while(!Arrays.equals(inhabitants,extinct)){

            for (int i = 0; i < inhabitants.length; i++) {

                if (inhabitants[i] != 0){
                    if (i>0 && inhabitants[i -1] == 0   ||   i < inhabitants.length && inhabitants[i+1] == 0){
                        inhabitants[i] /= 2;
                    }

                }

            }
            day++;
            System.out.println("Day "+ day +" " + Arrays.toString(inhabitants));

        }
        System.out.println("---- EXTINCT ----");
    }
}
