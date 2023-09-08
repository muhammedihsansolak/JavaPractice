package coreJavaPractice.day50_Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iterable {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>(Arrays.asList("Muhammed","Hülya","Ali Yahya","Defne"));

        //remove if starts with "M"

        Iterator<String> iterator =  names.iterator();

        while (iterator.hasNext()){
            if (iterator.next().startsWith("M")) iterator.remove();
        }
        System.out.println(names);


    }
}
