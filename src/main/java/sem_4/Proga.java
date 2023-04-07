package sem_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;

public class Proga {


    public static void main(String[] args) {
//        SimpleBox box = new SimpleBox();
//        Object object = new Object();
//        object = 2;
//        box.setObject(object);
//        SimpleBox box2 = new SimpleBox(121);
//        SimpleBox box3 = new SimpleBox("121");
//        Integer sum =0;
//        if (box3.getObject() instanceof Integer && box.getObject() instanceof Integer){
//            sum = (Integer)box2.getObject()+(Integer)box.getObject();
//        }
//        System.out.println(box);
//        System.out.println(box2);
//        System.out.println(box3);

//        System.out.println(sum);

//        GenBox<Integer> boxy = new GenBox<>(12);
//        GenBox<Integer> boxy1 = new GenBox<>(1121);
//        Integer summy = boxy1.getObject()+ boxy.getObject();
////        System.out.println(summy);
//        Double[] db = new Double[]{1.2,43.22,31.34,86.42};
//        Integer[] db1 = new Integer[]{1.2,43.22,50.232,86.42};
//        BoxWithNumber<Double> bwn = new BoxWithNumber<>(db);
//        BoxWithNumber<Double> bwn1 = new BoxWithNumber<>(db1);
//        System.out.println(bwn.average());
//
//        System.out.println(bwn.compare(bwn1));
//
//
        Random random = new Random();
        Calc12 calc = new Calc12();
        List<Double> ls3 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ls3.add(random.nextDouble(10.0));
//            ls3.add(12.92+i*10);

        }
        System.out.println(ls3);
        System.out.println(calc.multicplic(ls3));
        System.out.println(calc.binary(ls3));



        //        List<Emploi> empl = new ArrayList<>();
//        LRUCache<Emploi> cash = new LRUCache<>(5);
//        for (int i = 0; i < 10; i++) {
//            Emploi em = new Emploi("Ivanov",1234.0,"art"+i);
//            cash.addEl(em);
//        }
//        System.out.println(cash.getAllEl());

//        double s = 5.25;
//        int cel = (int)s;
//        int drbb = (int) ((s - (int)s)* (Math.pow(10,((new String(String.valueOf((s - (int)s)))).length()-2))));
//        System.out.println(cel);
//        System.out.println(drbb);
//
//        List<String> list = new ArrayList<>();
//        while (cel>0){
//            list.add((String)(String.valueOf(cel - cel/2*2)));
//            cel/=2;
//        }
//        String ls= "";
//        for (int i = 0; i < list.size(); i++) {
//            ls= ls + (String)list.get(i);
//        }





    }

}
