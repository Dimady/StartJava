package src.com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerSecond;
    public GuessNumber(Player playerOne, Player playerSecond) {
        this.playerOne = playerOne;
        this.playerSecond = playerSecond;
    }
    public void guess() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int gamer = 1;
        do {
            System.out.println("Ход игрока №" + gamer + ":");
            System.out.print("Введите число: ");
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Число " + guess + " больше того, что загадал компьютер");
                gamer = gamer % 2 + 1;
            } else if (guess < randomNumber) {
                System.out.println("Число " + guess + " меньше того, что загадал компьютер");
                gamer = gamer % 2 + 1;
            }
        } while (guess != randomNumber);
        System.out.println("Поздравляю, число угадано! Победил игрок: " +
                (gamer == 1 ?  playerOne.getName() : playerSecond.getName()));
    }
}
