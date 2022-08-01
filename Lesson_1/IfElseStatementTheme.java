package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 22;
        boolean maleGender = true;
        double height = 1.79;
        if (age > 20) {
            System.out.println("Вам можно продавать алкоголь");
        } else {
            System.out.println("Вам нельзя продавать алкоголь");
        }
        if (!maleGender) {
            System.out.println("Вы - женщина");
        }
        if (height < 1.80) {
            System.out.println("Вы низкого роста");
        } else  {
            System.out.println("Вы высокого роста");
        }
        char firstLetterName = "Michael".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на M");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("У вас другое имя");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 123;
        int num2 = 456;
        if (num1 > num2) {
            System.out.println("max = " + num1 + "\nmin = " + num2);
        } else {
            System.out.println("max = " + num2 + "\nmin = " + num1);
        }

        System.out.println("\n3. Работа с числом");
        int num = 78;
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " чётное");
            } else {
                System.out.println("Число " + num + " нечётное");
            }
            if (num > 0) {
                System.out.println("Число " + num + " положительное");
            } else {
                System.out.println("Число " + num + " отрицательное");
            }
        } else {
            System.out.println("num = " + num);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 345;
        num2 = 745;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        if (num1 / 100 % 10 == num2 / 100 % 10) {
            System.out.println("Одинаковые цифры: " + num1 / 100 % 10 + " в 1 разряде");
        }
        if (num1 / 10 % 10 == num2 / 10 % 10) {
                System.out.println("Одинаковые цифры: " + num1 / 10 % 10 + " во 2 разряде");
        }
        if (num1 % 10 == num2 % 10) {
            System.out.println("Одинаковые цифры: " + num1 % 10 + " в 3 разряде");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " - это большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " - это маленькая буква");
        } else if (symbol >= '0' && symbol <= '9') {
                    System.out.println("Символ " + symbol + " - это цифра");
                } else {
                    System.out.println("Символ " + symbol + " - это не буква и не цифра");
                }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        System.out.println("Сумма вклада: " + depositAmount + " руб.");
        int percent = 0;
        if (depositAmount < 100_000) percent = 5;
        else if (depositAmount >= 100_000 && depositAmount <= 300_000) percent = 7;
        else if (depositAmount > 300_000) percent = 10;
        double percentAmount = depositAmount * percent / 100;
        System.out.println("Начисленный процент по вкладу: " + percent + "%");
        System.out.println("Итоговая сумма с процентами: " + (depositAmount + percentAmount) + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentMark = 59;
        int historyMark = 2;
        if (historyPercentMark > 60) historyMark = 3;
        if (historyPercentMark > 73) historyMark = 4;
        if (historyPercentMark > 91) historyMark = 5;
        System.out.println("Оценка: " + historyMark + " Предмет: история");
        int programmingPercentMark = 91;
        int programmingMark = 2;
        if (programmingPercentMark > 60) programmingMark = 3;
        if (programmingPercentMark > 73) programmingMark = 4;
        if (programmingPercentMark > 91) programmingMark = 5;
        System.out.println("Оценка: " + programmingMark + " Предмет: программирование");
        System.out.println("Средний балл оценок по предметам: " + (double) (historyMark + programmingMark) / 2);
        System.out.println("Средний % по предметам: " + (double) (historyPercentMark + programmingPercentMark) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rentPremises = 5000;
        int productSales = 13000;
        int costGoods = 9000;
        int income = (productSales - costGoods - rentPremises) * 12;
        System.out.print("Прибыль за год: ");
        if (income > 0) System.out.println("+" + income);
        else System.out.println(income);

        System.out.println("\n9. Подсчет количества банкнот");
        int totalSum = 567;
        int banknotes10 = 5;
        int hundreds = totalSum / 100;
        int tens = totalSum / 10 % 10;
        int units = totalSum % 10;
        if (tens > banknotes10) {
            units += (tens - banknotes10) * 10;
            tens = banknotes10;
        }
        System.out.println("100: " + hundreds + " 10: " + tens + " 1: " + units +
                "\nИсходная сумма: " + (hundreds * 100 + tens * 10 + units));
    }
}
