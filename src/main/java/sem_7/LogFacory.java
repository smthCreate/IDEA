package sem_7;

public class LogFacory implements ICalculableFactory{
    private Loggable loggable;
    public LogFacory(ICalculableFactory calculableFactory){
        this.loggable = new LoggerCalc();
    }
    @Override
    public Calculable create(Integer[] primaryArg) {
        return new Calculator(primaryArg);
    }
}
