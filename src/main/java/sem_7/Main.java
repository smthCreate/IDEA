package sem_7;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory logFac = new LogFacory(calculableFactory);
        ViewCalculator view = new ViewCalculator(logFac);
        view.run();
    }
}
