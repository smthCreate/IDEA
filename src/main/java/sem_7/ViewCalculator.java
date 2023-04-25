package sem_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            System.out.println("Если вы хотите ввести комплексное число, вводите его в формате a+ib");
            Integer[] primaryArg = promptIntAr("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            Loggable loggable = new LoggerCalc();
            loggable.saveLog("Inputed "+massView(primaryArg));
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    Integer[] arg = promptIntAr("Введите второй аргумент: ");
                    calculator.multi(arg);
                    loggable.saveLog("Inputed "+massView(arg));
                    continue;
                }
                if (cmd.equals("+")) {
                    Integer[] arg = promptIntAr("Введите второй аргумент: ");
                    calculator.sum(arg);
                    loggable.saveLog("Inputed "+massView(arg));
                    continue;
                }
                if (cmd.equals("=")) {
                    Integer[] result = calculator.getResult();
                    System.out.printf("Результат %s\n", massView(result));
                    loggable.saveLog("Resulted "+massView(result));
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    public static Integer[] promptIntAr(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        String[] string = in.nextLine().split("");
        Integer[] res_end = new Integer[2];
        List<Integer> res = new ArrayList<>();
        if (Character.isDigit(string[0].charAt(0))){
            Integer toAdd = Integer.parseInt(string[0]);
            res.add(toAdd);
        }
        for (int i = 1; i < string.length; i++) {
            if (Character.isDigit(string[i].charAt(0))) {
                if (Character.isDigit(string[i-1].charAt(0))) {
                    res.set(res.size()-1,
                            res.get(res.size()-1)*10+Integer.parseInt(string[i]));
                } else {
                    Integer toAdd = Integer.parseInt(string[i]);
                    res.add(toAdd);
                }
            }
        }
        if (res.size()>2){
            System.out.println("Это слишком даже для комплексного числа(уменьште количество чисел)");
            promptIntAr(message);
        } else if (res.size()==1) {
            res_end[0]=res.get(0);
            res_end[1]=0;
        } else if (res.size()<1) {
            res_end[0] = 0;
            res_end[1] = 0;
        } else if (res.size()==2) {
            res_end[0]=res.get(0);
            res_end[1]=res.get(1);
        }
        return res_end;
    }
    private String massView(Integer[] arg){
        return Arrays.toString(arg)
                .substring(1, 3*arg.length)
                .replaceAll(", ", "+i");
    }
}
