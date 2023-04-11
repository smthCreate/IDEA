package sem_3.Game_cows;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWorld();//слово загаданное пк
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputValue(String value) {
        attempts--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
            checkStatus(bulls,cows,attempts);
        }
        return new Answer(value, cows, bulls);
    }
    /**
     * Отвечает за смену статуса
     * */
    private void checkStatus(int bulls, int cows, Integer attempts) {
        if (attempts>-1){
            if (bulls==sizeWord){
                gameStatus = GameStatus.WIN;
            }
        } else gameStatus = GameStatus.LOSE;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    private String generateWorld() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWorld = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWorld = resWorld.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWorld;
    }

    abstract List<String> generateCharList();
}
