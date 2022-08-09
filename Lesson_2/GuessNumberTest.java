package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        System.out.println("Введите имя игрока №1: ");
        String name1 = scanner.next();
        System.out.println("Введите имя игрока №2: ");
        String name2 = scanner.next();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        boolean nextGame = true;
        while (nextGame) {
            System.out.println(GuessNumber.guess(player1.getName(), player2.getName()));
            while (true) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                String next = scanner.next();
                if (next.equals("no")) {
                    nextGame = false;
                    break;
                } else if (next.equals("yes")) break;
            }
        }
    }
}
