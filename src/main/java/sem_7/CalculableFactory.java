package sem_7;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(Integer[] primaryArg) {
        return new Calculator(primaryArg);
    }
}
