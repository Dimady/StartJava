import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        int digit;
        System.out.print("Исходное число в обратном порядке: ");
        while (num % 10 != 0) {
            digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.println("\nСумма цифр числа: " + sum);

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

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591;
        System.out.print("Число " + num);
        int count = 0;
        while (num % 10 != 0) {
            digit = num % 10;
            if (digit == 1) count++;
            num /= 10;
        }
        System.out.println(" содержит " + count + (count % 2 == 0 ? " (четное)" : " (нечетное)")  + " количество единиц");

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
            } while (m < 5 - j - 2);
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
        int temp = num;
        int rev = 0;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Число " + temp + (temp == rev ? " является" : " не является") + " палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 234351;
        int leftSum = 0;
        int rightSum = 0;
        for (int n = 0; n < 3; n++) {
            digit = num % 10;
            leftSum += digit;
            num /= 10;
        }
        for (int n = 0; n < 3; n++) {
            digit = num % 10;
            rightSum += digit;
            num /= 10;
        }
        System.out.println(leftSum == rightSum);
   }
}
