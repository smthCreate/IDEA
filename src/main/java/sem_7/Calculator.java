package sem_7;

import lombok.Data;

@Data
public final class Calculator implements Calculable {

    private Integer[] primaryArg;

    public Calculator(Integer[] primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(Integer[] arg) {
        for (int i = 0; i <arg.length; i++) {
            primaryArg[i]+=arg[i];
        }
        return this;
    }

    @Override
    public Calculable multi(Integer[] arg) {
        for (int i = 0; i <arg.length; i++) {
            primaryArg[i]*=arg[i];
        }
        return this;
    }

    @Override
    public Integer[] getResult() {
        return primaryArg;
    }
}
