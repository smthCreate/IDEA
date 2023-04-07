package sem_3.Game_cows;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1 - цифра");
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите игру: ");
        int num = scanner.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new EnGame();
                break;
            case 3:
                game = new RuGame();
                break;
            default:
                System.out.println("данная игра еще не добавлена!");
        }
        while (game.getGameStatus().equals(GameStatus.START)){
            System.out.println("ход: ");
            String answer = scanner.nextLine();
            Answer answerGame = game.inputValue(answer);
            System.out.println("коров - "+ answerGame.getCow()+" , быков - "+answerGame.getBull());
        }

    }
}
