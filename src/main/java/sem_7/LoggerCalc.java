package sem_7;

import lombok.Data;

@Data
public class LoggerCalc implements Loggable{
    @Override
    public void saveLog(String str) {
        System.out.println(str);
    }

}
