package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        GuessNumber guessNumber = new GuessNumber();
        Player player1 = guessNumber.initPlayer1();
        Player player2 = guessNumber.initPlayer2();
        String nextGame;
        do {
            System.out.println(guessNumber.guess(player1, player2));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                nextGame = scanner.next();
            } while (!nextGame.equals("no") && !nextGame.equals("yes"));
        } while (!nextGame.equals("no"));
    }
}
