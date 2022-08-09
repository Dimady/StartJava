package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    public static String guess(String name1, String name2) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess, i;
        do {
            i = 1;
            do {
                System.out.println("Ход игрока №" + i + ":");
                System.out.print("Введите число: ");
                guess = scanner.nextInt();
                if (guess > randomNumber) {
                    System.out.println("Число " + guess + " больше того, что загадал компьютер");
                    i++;
                } else if (guess < randomNumber) {
                    System.out.println("Число " + guess + " меньше того, что загадал компьютер");
                    i++;
                } else break;
            } while (i == 2);
        } while (guess != randomNumber);
        return "Поздравляю, число угадано! Победил игрок: " + (i == 1 ?  name1 : name2);
    }
}
