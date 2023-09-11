import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        String str = "abcde";
        System.out.println(Arrays.toString(solution(str)));

    }

    public static String[] solution(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() % 2 == 0){
            for (int i = 1; i < s.length(); i++) {
                list.add( "" + s.charAt(i -1) + s.charAt(i) );
                i++;
            }
        }else {
            for (int i = 1; i < s.length() - 1; i++) {
                list.add( "" + s.charAt(i -1) + s.charAt(i) );
                i++;
            }
            list.add(s.charAt(s.length()-1)+"_");
        }
        return list.toArray(new String[0]);
    }
}

