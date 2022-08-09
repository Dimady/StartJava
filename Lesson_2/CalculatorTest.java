package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean nextCalc = true;
        while (nextCalc) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println(Calculator.calc(a, mathOperation, b));
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String next = scanner.next();
                if (next.equals("no")) {
                    nextCalc = false;
                    break;
                } else if (next.equals("yes")) break;
            }
        }
    }
}
