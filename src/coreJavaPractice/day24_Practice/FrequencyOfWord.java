package coreJavaPractice.day24_Practice;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "java java java c# c# c# python python";
        String word = "java";
        int result = frequencyOfWord(str, word);
        System.out.println(result);


    }

    public static int frequencyOfWord(String str, String word) {
        int count = 0;
        int length = word.length();
        for (int i = 0; i <= str.length() - length ; i++) {
          if ( str.substring(i , i+length).equals(word)   ){
              count++;
          }
        }
        return count;


        /* second solution ==>
int count = 0;
while(str.contains(word)){
str = str.replaceFirst(word,"");
count++;
         */

        /* third solution ==>
String arr[] = str.split(" ");
int count = 0;
for (String each : arr) {
if (each.equals(word)) {
count++;
            }
        }
return count;
         */
    }
}
//create a method named frequencyOfWord that passes two parameters: string sentence and String word,
// then returns the frequency of word from the sentence