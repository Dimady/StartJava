package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);

    public Player initPlayer1() {
        System.out.println("Введите имя игрока №1: ");
        String name = scanner.next();
        return new Player(name);
    }

    public Player initPlayer2() {
        System.out.println("Введите имя игрока №2: ");
        String name = scanner.next();
        return new Player(name);
    }

    public String guess(Player player1, Player player2) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        boolean gamer1 = true;
        do {
                System.out.println("Ход игрока №" + (gamer1 ? 1 : 2) + ":");
                System.out.print("Введите число: ");
                guess = scanner.nextInt();
                if (guess > randomNumber) {
                    System.out.println("Число " + guess + " больше того, что загадал компьютер");
                    gamer1 = !gamer1;
                } else {
                    System.out.println("Число " + guess + " меньше того, что загадал компьютер");
                    gamer1 = !gamer1;
                }
        } while (guess != randomNumber);
        return "Поздравляю, число угадано! Победил игрок: " +
                (gamer1 ?  player1.getName() : player2.getName());
    }
}
