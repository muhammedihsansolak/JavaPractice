import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        String pattern = "aaba";
        String str = "fish fish horse horse";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        String[] split = str.split(" ");
        if (pattern.length() != split.length) return false;
        Map map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if ( map.put(pattern.charAt(i) , i) != map.put(split[i] , i) ) return false;
        }
        return true;
    }

}


