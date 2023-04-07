package sem_4;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class Calc12 {
    public Double sum(List<? extends Number> list){
        Double sum =0.0;
        for (Number num:
             list) {
            sum+=num.doubleValue();

        }
        return sum;
    }
    public Double multicplic(List<? extends Number> list){
        Double mult =1.0;
        for (Number num:
                list) {
            mult*=num.doubleValue();

        }
        return mult;
    }
    public Double division(List<? extends Number> list){
        Double div =(double)list.get(0);
        for (int i = 1; i < list.size(); i++) {
            div/=list.get(i).doubleValue();
        }
        return div;
    }
    public List<String> binary(List<? extends Number> list){
        List<String> n_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            double scale = Math.pow(10, 3);
            double s = Math.ceil((Double) list.get(i)*scale)/scale;
            Integer cel = (int) (s);
            Double drbb = ((s - (int)(s)));
            String res = binaring(cel,drbb);
            n_list.add(res);
        }
        return n_list;
    }

    private String binaring(Integer cel, Double drbb) {
        String res="";
        String celS = binary_cel(cel);
        String drbbS = binary_drob(drbb);
        res = celS+"."+drbbS;
        return res;
    }

    private String binary_drob(Double drob) {
        List<String> list = new ArrayList<>();
        double n_drob = drob;
        while ((n_drob-(int)n_drob)!=0 && list.size()<10){
            n_drob*=2;
            String toL = (String)(String.valueOf(((int)n_drob)));
            list.add(toL);
            n_drob = n_drob- (int)n_drob;
        }
        String ls= "";
        for (int i = 0; i < list.size(); i++) {
            ls= ls + (String)list.get(i);
        }
        return ls;
    }

    private String binary_cel(Integer cel) {
        List<String> list = new ArrayList<>();
        while (cel>0){
            list.add((String)(String.valueOf(cel - cel/2*2)));
            cel/=2;
        }
        String ls= "";
        for (int i = list.size()-1; i >-1 ; i--) {
            ls= ls + (String)list.get(i);
        }
        return ls;
    }
}
