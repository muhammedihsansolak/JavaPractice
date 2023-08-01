import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

/**
 * main class
 */

public class Main {
    public static void main(String[] args) {
        BigDecimal num = BigDecimal.valueOf(123.36167);
        System.out.println(num.setScale(3, RoundingMode.FLOOR));
        System.out.println(num);

    }
}


