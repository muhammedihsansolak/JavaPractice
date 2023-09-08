package coreJavaPractice.day16_Practice;

public class FrequencyOfJava {

    public static void main(String[] args) {

        String sentence = "java java";
            //             012345 678
        int frequency = 0;

        for (int i = 0; i <= sentence.length()-4 ; i++) {//-4 is for compiler looks 5 to 9. there is no 9 index but substring excludes the nineth index. so in order to find eight char we have to write 9. index

           String isJava = sentence.substring(i,i+4);
            if (isJava.equalsIgnoreCase("java")){
                ++frequency;
            }
        }
        System.out.println(frequency);





    }
}
/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */