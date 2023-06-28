package day15_Practice;

public class CountOfDogAndCat {
    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt caat Dog dOOg a cat dat";
        int countDog = 0, countCat = 0;

        for (int i = 0; i <= sentence.length()-3; i++) {
            // 3 (word.length of cat or od) is subtracted from the sentence.length
            // So, while iterating one by one, loop will give enough room to search
            // whether the last characters of the sentence equals to the cat/dog word.
            // Otherwise loop will be out of range.

            //create a word each time
            String isItCatOrDog = sentence.substring(i, i+3);

            // and then check whether equals (IgnoreCase) to cat or dog word
            if(isItCatOrDog.equalsIgnoreCase("cat")){
                countCat++;
            } else if (isItCatOrDog.equalsIgnoreCase("dog")) {
                countDog++;
            }
        }

        System.out.println("cat = " + countCat);
        System.out.println("dog = " + countDog);
        System.out.println(countCat==countDog);

    }

}
