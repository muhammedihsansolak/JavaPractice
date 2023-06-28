package day24_Practice;
import java.util.*;
public class FindFrequencyOfAChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
//Find the frequency of each character in `str` and concatenate the frequency number with the character.
// Return the concatenated String with all the frequencies.
    public static String countLetters(String str){
        String result = "";
        while(!str.isEmpty()){
            for(int i = 0; i<=str.length()-1;i++){
                int count = 0;
                for(int j = 0; j<=str.length()-1;j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result+= ""+count+str.charAt(i);
                str = str.substring(count);

            }




        }
        return result;


    }


}
