package localDatePractice;

import java.time.LocalDate;

public class LocalDateMethods {
    public static void main(String[] args) {

        //**** now() ****
        System.out.println( LocalDate.now() );//2023-07-14

        //**** of() ****
        System.out.println( LocalDate.of(1999, 01, 31) ); //1999-01-31

        //The input text should be in the ISO-8601 date format "yyyy-MM-dd" (e.g., "2023-07-14").
        //**** parse() ****
        System.out.println( LocalDate.parse("1999-01-31") );//1999-01-31

    }
}
