package sem_3.Game_cows;

public interface Game {
    void start(Integer sizeWord, Integer attempts);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
