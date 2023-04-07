package sem_3;

public class Proga {
    public static void main(String[] args) {
        Fructr fruct = Fructr.BANANA;
        switch (fruct){
            case APPLE -> System.out.println("This is!");
            case ORANGE, BANANA -> System.out.println("not this");
        }
        for (Fructr fruct1: Fructr.values()
             ) {
            System.out.println(fruct1);

        }
        System.out.println(Fructr.valueOf("APPLE"));
    }
}
