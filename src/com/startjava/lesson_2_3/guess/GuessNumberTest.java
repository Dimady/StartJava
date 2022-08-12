package src.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        System.out.println("Введите имя первого игрока: ");
        Player playerOne = new Player(scanner.next());
        System.out.println("Введите имя второго игрока: ");
        Player playerSecond = new Player(scanner.next());
        String nextGame;
        do {
            GuessNumber guessNumber = new GuessNumber(playerOne, playerSecond);
            guessNumber.guess();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                nextGame = scanner.next();
            } while (!nextGame.equals("no") && !nextGame.equals("yes"));
        } while (!nextGame.equals("no"));
    }
}