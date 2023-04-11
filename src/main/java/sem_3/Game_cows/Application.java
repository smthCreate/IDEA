package sem_3.Game_cows;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите игру: "+"\n"+"1 - Number game"
                +"\n"+"2 - Ru game"
                +"\n"+"3 - Eng game");
        int num = scanner.nextInt();
        System.out.println("Input word's size you want");
        int wordSize = scanner.nextInt();
        System.out.println("Input attempts' amount you want");
        int attamptsAm = scanner.nextInt();

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
        game.start(wordSize,attamptsAm);
        while (game.getGameStatus().equals(GameStatus.START)){
            System.out.println("ход: ");
            String answer = scanner.nextLine();
            Answer answerGame = game.inputValue(answer);
            System.out.println("коров - "+ answerGame.getCow()+" , быков - "+answerGame.getBull());
        }
        System.out.println(game.getGameStatus());

    }
}
