package src.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String nextCalc;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println(calculator.calc(a, mathOperation, b));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                nextCalc = scanner.next();
            } while (!nextCalc.equals("no") && !nextCalc.equals("yes"));
        } while (!nextCalc.equals("no"));
    }
}
