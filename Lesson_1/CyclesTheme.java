package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int i = startRange;
        do {
            if (i % 2 == 0) sumEven += i;
            else sumOdd += i;
            i++;
        } while (i <= endRange);
        System.out.println("В промежутке [" + startRange + ", " + endRange + "] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min, max;
        if (num1 < num2 && num1 < num3) min = num1;
        else if (num2 < num1 && num2 < num3) min = num2;
        else min = num3;

        if (num1 > num2 && num1 > num3) max = num1;
        else if (num2 > num1 && num2 > num3) max = num2;
        else max = num3;
        System.out.println("min = " + min + "\nmax = " + max);
        for (int j = max - 1; j > min; j--)
            System.out.print(j + " ");

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        int digit;
        int rev = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Исходное число в обратном порядке: " + rev);
        System.out.println("Сумма цифр числа: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        startRange = 1;
        endRange = 24;
        i = 0;
        for (int j = startRange; j < endRange; j += 2) {
            System.out.printf("%3d", j);
            i++;
            if (i % 5 == 0) System.out.println();
        }
        for (int j = 0; j < (5 - i % 5); j++)
            System.out.printf("%3d", 0);
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591;
        int copyNum = num;
        int countOnes = 0;
        while (num > 0) {
            digit = num % 10;
            if (digit == 1) countOnes++;
            num /= 10;
        }
        System.out.println("Число " + copyNum + " содержит " + countOnes +
                (countOnes % 2 == 0 ? " (четное)" : " (нечетное)") + " количество единиц");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int j = 0;
        while (j < 5) {
            int k = 0;
            while (k < 5 - j) {
                System.out.print("#" + (k == 4 - j ? "\n" : ""));
                k++;
            }
            j++;
        }
        System.out.println();
        int k = 0;
        do {
            int l = (2 - k > 0 ? k + 1 : 5 - k);
            int m = 0;
            do {
                System.out.print('$' + (m == l - 1 ? "\n" : ""));
                m++;
            } while (m < l);
            k++;
        } while (k < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println(" Dec\tChar");
        System.out.println("------------");
        for (int n = 0; n < 48; n++) {
            if (n % 2 != 0) {
                System.out.printf("%3d\t\t%c\n", n, n);
            }
        }
        for (int n = 97; n < 123; n++) {
            if (n % 2 == 0) {
                System.out.printf("%3d\t\t%c\n", n, n);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        copyNum = num;
        rev = 0;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Число " + copyNum + (copyNum == rev ? "" : " не") + " является палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 234351;
        int leftSum = 0;
        int rightSum = 0;
        int leftNum = num / 1000;
        int copyLeft = leftNum;
        int rightNum = num % 1000;
        int copyRight = rightNum;
        while (leftNum > 0 && rightNum > 0) {
            leftSum += leftNum % 10;
            rightSum += rightNum % 10;
            leftNum /= 10;
            rightNum /= 10;
        }
        System.out.println("Сумма цифр " + copyLeft + " = " + leftSum + " Сумма цифр " + copyRight + " = " + rightSum);
        System.out.println("Число " + num + (leftSum == rightSum ? "" : " не") + " является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\t ТAБЛИЦА    ПИФАГОРА");
        for (int x = 1; x < 10; x++) {
            if (x == 2) System.out.println("  ---------------------------");
            for (int y = 1; y < 10; y++) {
                if (x == 1 && y == 1) {
                    System.out.printf("%3c", ' ');
                    continue;
                }
                if (y == 2) System.out.print(" |");
                System.out.printf("%3d", x * y);
            }
            System.out.println();
        }
    }
}
