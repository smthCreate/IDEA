package sem_3.Game_cows;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}

