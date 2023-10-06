package leetCodePractice;

import java.util.HashSet;
import java.util.Set;

public class MorseCodeTransformation  {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> transformations = new HashSet<>();

        for (String word : words) {
            String morse = "";
            for (char ch : word.toCharArray()) {
                morse += morseCodes[ch-'a'];
            }
            transformations.add(morse);
        }
        return transformations.size();
    }

    public int uniqueMorseRepresentations2(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> transformations = new HashSet<>();

        for (String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (char c : word.toCharArray()) {
                transformation.append( morseCodes[c - 'a'] );
            }
            transformations.add( transformation.toString() );
        }
        return transformations.size();
    }

    public static void main(String[] args) {
        MorseCodeTransformation solution = new MorseCodeTransformation();

        String[] words1 = {"gin", "zen", "gig", "msg"};
        System.out.println(solution.uniqueMorseRepresentations(words1)); // Output: 2

        String[] words2 = {"a"};
        System.out.println(solution.uniqueMorseRepresentations(words2)); // Output: 1
    }







    /*
    International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.
     */
}
