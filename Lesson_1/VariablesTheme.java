package Lesson_1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Creating variables and displaying their values to the console");
        byte usbPortsCount = 3;
        System.out.println(usbPortsCount);
 
        short screenSize = 16;
        System.out.println(screenSize);
 
        int cpuFrequeency = 2000;
        System.out.println(cpuFrequeency);
 
        long hddCapacity = 1000000l;
        System.out.println(hddCapacity);
 
        float bodyThickness = 23.6f;
        System.out.println(bodyThickness);
 
        double bezelThikness = 7.3;
        System.out.println(bezelThikness);
 
        char modelLetter = 'A';
        System.out.println(modelLetter);
 
        boolean isLaptop = true;
        System.out.println(isLaptop);

        System.out.println("\n2. Calculation of the cost of goods with a discount");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        double discount = (priceGoodsX + priceGoodsY) * 11 / 100;
        System.out.println(discount);
        System.out.println(priceGoodsX + priceGoodsY - discount);

        System.out.println("\n3. Output of the JAVA word to the console");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Displaying min and max values of numeric data types");
        usbPortsCount = Byte.MAX_VALUE;
        System.out.println(usbPortsCount);
        System.out.println(++usbPortsCount);
        System.out.println(--usbPortsCount);

        screenSize = Short.MAX_VALUE;
        System.out.println(screenSize);
        System.out.println(++screenSize);
        System.out.println(--screenSize);

        cpuFrequeency = Integer.MAX_VALUE;
        System.out.println(cpuFrequeency);
        System.out.println(++cpuFrequeency);
        System.out.println(--cpuFrequeency);

        hddCapacity = Long.MAX_VALUE;
        System.out.println(hddCapacity);
        System.out.println(++hddCapacity);
        System.out.println(--hddCapacity);

        System.out.println("\n5. Permutation of variable values");
        double num1 = 1.1;
        double num2 = 2.2;
        System.out.println("Permutation of variable values using the third variable");
        System.out.println("Initial values of variables:");
        System.out.println("first = " + num1);
        System.out.println("second = " + num2);
        double tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("New variable values:");
        System.out.println("first = " + num1);
        System.out.println("second = " + num2);
        System.out.println("Permutation of variable values using arithmetic operations");
        System.out.println("Initial values of variables:");
        System.out.println("first = " + num2);
        System.out.println("second = " + num1);
        num2 += num1;
        num1 = num2 - num1;
        num2 -= num1;
        System.out.println("New variable values:");
        System.out.println("first = " + num2);
        System.out.println("second = " + num1);
        System.out.println("Permutation of variable values using a bitwise operation ^");
        System.out.println("Initial values of variables:");
        System.out.println("first = " + num1);
        System.out.println("second = " + num2);
        int intFirst = (int) (num1 * 10);
        int intSecond = (int) (num2 * 10);
        intFirst ^= intSecond;
        intSecond ^= intFirst;
        intFirst ^= intSecond;
        num1 = (double) intFirst / 10;
        num2 = (double) intSecond / 10;
        System.out.println("New variable values:");
        System.out.println("first = " + num1);
        System.out.println("second = " + num2);
 
        System.out.println("\n6. Output of symbols and their codes");
        int code1 = 35, code2 = 38, code3 = 64, code4 = 94, code5 = 95;
        System.out.println(code1 + " " + (char) code1);
        System.out.println(code2 + " " + (char) code2);
        System.out.println(code3 + " " + (char) code3);
        System.out.println(code4 + " " + (char) code4);
        System.out.println(code5 + " " + (char) code5);

        System.out.println("\n7. Product and sum of digits of a number");
        int srcNum = 345;
        int hundreds = srcNum / 100;
        int tens = srcNum % 100 / 10;
        int units = srcNum % 10;
        int sumDigits = hundreds + tens + units;
        int productDigits = hundreds * tens * units;
        System.out.println("The sum of the digits of the number N = " + sumDigits);
        System.out.println("The product of the digits of the number N = " + productDigits);

        System.out.println("\n8. Output to the ASCII console-art Duke");
        char sl = '/', bs = '\\', ul = '_', ob = '(', cb = ')', sp = ' ';
        System.out.println("" + sp + sp + sp + sp + sl + bs);
        System.out.println("" + sp + sp + sp + sl + sp + sp + bs);
        System.out.println("" + sp + sp + sl + ul + ob + sp + cb + bs);
        System.out.println("" + sp + sl + sp + sp + sp + sp + sp + sp + bs);
        System.out.println("" + sl + ul + ul + ul + ul + sl + bs + ul + ul + bs);

        System.out.println("\n9. Displaying the number of hundreds, tens and units of a number");
        srcNum = 123;
        hundreds = srcNum / 100;
        tens = srcNum % 100 / 10;
        units = srcNum % 10;
        System.out.println(hundreds + " hundreds\n" + tens + " tens\n" + units + " units");

        System.out.println("\n10. Converting Seconds");
        int totalSec = 86399;
        String hh = Integer.toString(totalSec / 3600);
        String mm = Integer.toString(totalSec / 60 % 60);
        String ss = Integer.toString(totalSec % 60);
        hh = (hh.length() == 2) ? hh : ("0" + hh);
        mm = (mm.length() == 2) ? mm : ("0" + mm);
        ss = (ss.length() == 2) ? ss : ("0" + ss); 
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}