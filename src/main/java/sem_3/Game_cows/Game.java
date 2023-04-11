package sem_3.Game_cows;
/**
 * Прописываются методы, которые 100% будут в программе
 * */
public interface Game {
    void start(Integer sizeWord, Integer attempts);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
