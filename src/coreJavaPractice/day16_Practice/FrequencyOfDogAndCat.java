package coreJavaPractice.day16_Practice;

public class FrequencyOfDogAndCat {
    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt Dog CAT DOGG caT";

        boolean output;
        int cats= 0;
        int dogs= 0;

        for (int i = 0; i <= sentence.length()-3 ; i++) {
          String foundString =  sentence.substring(i,i+3);
          if (foundString.equalsIgnoreCase("cat")){
              ++cats;
          } else if (foundString.equalsIgnoreCase("dog")) {
              ++dogs;
          }
        }
       output = cats == dogs;
        System.out.println(output);
    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */