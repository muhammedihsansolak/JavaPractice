package leetCodePractice;

import java.util.ArrayList;
import java.util.Collections;

public class AverageSalaryExcludingMinAndMax {
    public double average(int[] salary) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int each : salary){
            list.add(each);
        }
        Collections.sort(list);
        double sum = 0;
        for(int i  =0; i<list.size() ; i++){
            if(i == 0 || i == list.size()-1){
                continue;
            }
            sum += list.get(i);
        }
        return sum/(list.size()-2);
    }
}
