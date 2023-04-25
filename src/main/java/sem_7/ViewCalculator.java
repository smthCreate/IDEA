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
            Integer[] primaryArg = Prompt.promptIntAr("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            Loggable loggable = new LoggerCalc();
            loggable.saveLog("Inputed "+Prompt.massView(primaryArg));
            while (true) {
                String cmd = Prompt.prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    Integer[] arg = Prompt.promptIntAr("Введите второй аргумент: ");
                    calculator.multi(arg);
                    loggable.saveLog("Inputed "+Prompt.massView(arg));
                    continue;
                }
                if (cmd.equals("+")) {
                    Integer[] arg = Prompt.promptIntAr("Введите второй аргумент: ");
                    calculator.sum(arg);
                    loggable.saveLog("Inputed "+Prompt.massView(arg));
                    continue;
                }
                if (cmd.equals("=")) {
                    Integer[] result = calculator.getResult();
                    System.out.printf("Результат %s\n", Prompt.massView(result));
                    loggable.saveLog("Resulted "+Prompt.massView(result));
                    break;
                }
            }
            String cmd = Prompt.prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }


}
