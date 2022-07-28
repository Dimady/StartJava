public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int i = start;
        do {
            if (i % 2 == 0) sumEven += i;
            else sumOdd += i;
            i++;
        } while (i <= end);
        System.out.println("В промежутке [" + start + ", " + end + "] сумма четных чисел = " + sumEven +
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
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        for (int j = max - 1; j > min; j--)
            System.out.print(j + " ");
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        int digit;
        int rev = 0;
        while (num % 10 != 0) {
            digit = num % 10;
            sum += digit;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Исходное число в обратном порядке: " + rev);
        System.out.println("Сумма цифр числа: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        start = 1;
        end = 24;
        i = 0;
        for (int j = start; j < end; j += 2) {
            System.out.printf("%3d", j);
            i++;
            if (i % 5 == 0) System.out.println();
        }
        for (int j = 0; j < (i % 10 > 5 ? (i / 10) * 10 + 10 - i : (i / 10) * 10 + 5 - i); j++)
            System.out.printf("%3d", 0);
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591;
        int temp = num;
        int count = 0;
        while (num % 10 != 0) {
            digit = num % 10;
            if (digit == 1) count++;
            num /= 10;
        }
        System.out.println("Число " + temp + " содержит " + count + (count % 2 == 0 ? " (четное)" : " (нечетное)")  + " количество единиц");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 10; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        int j = 0;
        while (j < 5) {
            int k = 0;
            while (k < 5 - j) {
                System.out.print("#");
                k++;
            }
            System.out.println();
            j++;
        }
        System.out.println();
        j = 1;
        do {
            int k = 0;
            do {
                System.out.print("$");
                k++;
            } while (k < j);
            System.out.println();
            j++;
        } while (j <= 2);
        j = 0;
        do {
            int m = 0;
            do {
                System.out.print("$");
                m++;
            } while (m < 3 - j);
            System.out.println();
            j++;
        } while (j <= 2);

        System.out.println("\n7. Отображение ASCII-символов");
        for (int n = 0; n < 48; n++)
            if (n % 2 != 0)
                System.out.printf("%3d %c\n", n, n);
        for (int n = 97; n < 123; n++)
            if (n % 2 == 0)
                System.out.printf("%3d %c\n", n, n);

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        temp = num;
        rev = 0;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Число " + temp + (temp == rev ? "" : " не") + " является палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 234351;
        int leftSum = 0;
        int rightSum = 0;
        int leftNum = num / 1000;
        int tempLeft = leftNum;
        int rightNum = num % 1000;
        int tempRight = rightNum;
        while (leftNum != 0) {
            leftSum += leftNum % 10;
            leftNum /= 10;
        }
        while (rightNum != 0) {
            rightSum += rightNum % 10;
            rightNum /= 10;
        }
        System.out.println("Сумма цифр " + tempLeft + " = " + leftSum + " Сумма цифр " + tempRight + " = " + rightSum);
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
