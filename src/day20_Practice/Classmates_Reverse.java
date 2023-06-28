package day20_Practice;

public class Classmates_Reverse {

    public static void main(String[] args) {
        String classmates[] = {"Ömer", "Ali", "Fatma", "Beyza", "Zeynep", "Burak","Özlem","Muhammed",
                "Taner", "Defne"};


        for (int i = 0; i < classmates.length; i++) {
            String reversed = "";
            for (int j = classmates[i].length()-1; j >= 0; j--) {
               reversed += classmates[i].charAt(j);
            }
            System.out.println(reversed);
        }
    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */