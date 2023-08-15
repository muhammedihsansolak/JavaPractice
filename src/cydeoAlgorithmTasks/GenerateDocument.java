package cydeoAlgorithmTasks;

import java.util.*;

public class GenerateDocument {
    public static void main(String[] args) {
        String characters = "aabbcc c";
        String document = "aabbccc";
        System.out.println(generateDocument(characters, document));
    }

    public static boolean generateDocument(String characters, String document){

        HashMap<Character,Integer> availableCharacters = new HashMap<>();
        for (char each : characters.toCharArray()) {
            availableCharacters.put( each , availableCharacters.getOrDefault(each , 0) + 1 );
        }

        for (char each : document.toCharArray()) {
            if ( ! availableCharacters.containsKey(each) || availableCharacters.get(each) == 0) {
                return false;
            } else if (availableCharacters.containsKey(each)){
                availableCharacters.put(each , availableCharacters.get(each) -1 );
            }
        }
        return true;
    }
}
/*
You're given a string of available characters and a string representing a document that you need to generate.
Write a function that determines if you can generate the document using the available characters. If you can
generate the document, your function should return true; otherwise, it should return false. You're only able to
generate the document if the frequency of unique characters in the characters string is greater than or equal
to the frequency of unique characters in the document string.
• For example, if you're given characters = "abcabc" and document = "aabbccc" you cannot generate the
document because you're missing one c . The document that you need to create may contain any characters,
including special characters, capital letters, numbers, and spaces. Note: you can always generate the empty
string ( "" ).
• Sample Input :
• characters = "!veDJaCyd vaeo perelo xw" document = "Cydeo Java Developer!"
• Sample Output :
• true

 */