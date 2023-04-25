package Proba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import sem_7.ViewCalculator;
import sem_7.ViewCalculator.*;

public class Proga {
    public static void main(String[] args) {
        Integer[] arg = new Integer[]{1,2,3};
        StringBuilder sb = new StringBuilder();
        for (Integer in:
                arg) {sb.append(arg);
        }
        String str = Arrays.toString(arg)
                .substring(1, 3*arg.length-1)
                .replaceAll(", ", "");
        System.out.println(str);


//        Integer[] inr = promptIntAr("input");
//        for (int i = 0; i < inr.length; i++) {
//            System.out.println(inr[i]);
//        }
//        Scanner in = new Scanner(System.in);
//        String[] string = in.nextLine().split("");
//        List<Integer> res = new ArrayList<>();
//        System.out.println();
//        if (Character.isDigit(string[0].charAt(0))){
//            Integer toAdd = Integer.parseInt(string[0]);
//            res.add(toAdd);
//        }
//        for (int i = 1; i < string.length; i++) {
//            if (Character.isDigit(string[i].charAt(0))) {
//                if (Character.isDigit(string[i-1].charAt(0))) {
//                    res.set(res.size()-1,
//                            res.get(res.size()-1)*10+Integer.parseInt(string[i]));
//                } else {
//                    Integer toAdd = Integer.parseInt(string[i]);
//                    res.add(toAdd);
//                }
//            }
//        }
//        System.out.println(res);
    }
//    public static Integer[] promptIntAr(String message) {
//        Scanner in = new Scanner(System.in);
//        System.out.println(message);
//        String[] string = in.nextLine().split("");
//        Integer[] res_end = new Integer[2];
//        List<Integer> res = new ArrayList<>();
//        if (Character.isDigit(string[0].charAt(0))){
//            Integer toAdd = Integer.parseInt(string[0]);
//            res.add(toAdd);
//        }
//        for (int i = 1; i < string.length; i++) {
//            if (Character.isDigit(string[i].charAt(0))) {
//                if (Character.isDigit(string[i-1].charAt(0))) {
//                    res.set(res.size()-1,
//                            res.get(res.size()-1)*10+Integer.parseInt(string[i]));
//                } else {
//                    Integer toAdd = Integer.parseInt(string[i]);
//                    res.add(toAdd);
//                }
//            }
//        }
//        if (res.size()>2){
//            System.out.println("Это слишком даже для комплексного числа(уменьште количество чисел)");
//            promptIntAr(message);
//        } else if (res.size()==1) {
//            res_end[0]=res.get(0);
//            res_end[1]=0;
//        } else if (res.size()<1) {
//            res_end[0] = 0;
//            res_end[1] = 0;
//        } else if (res.size()==2) {
//            res_end[0]=res.get(0);
//            res_end[1]=res.get(1);
//        }
//        return res_end;
//    }
}
