package sem_6;

import java.util.Scanner;
/**
 * класс отвечает отдельно за ввод данных, не смогла придумать как унаследоваться от какого-нибудь базового, чтобы каждый наследник мог принимать на вход
 * */
public class Prompt {

    public String promptStr(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String input;
        if (in.hasNext()){
            input = in.next();
        }else{
            System.out.println("Ошибка. Повторите ввод операции");
            in.next();
            input = promptStr(message);
        }
        return input;
    }
    public Double promptD(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        Double input;
        if (in.hasNextDouble()){
            input = in.nextDouble();
        }else{
            System.out.println("Ошибка. Повторите ввод операции");
//            in.nextDouble();
            input = promptD(message);
        }
        return input;
    }
    public Integer promptI(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        Integer input;
        if (in.hasNext()){
            input = in.nextInt();
        }else{
            System.out.println("Ошибка. Повторите ввод операции");

            input = promptI(message);
        }
        return input;
    }
}
