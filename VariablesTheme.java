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
        int x = 100;
        int y = 200;
        double discount = (x + y) * 11 / 100;
        System.out.println(discount);
        System.out.println(x + y - discount);

        System.out.println("\n3. Output of the JAVA word to the console");
        System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a\nJ  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a");

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
        double first = 1.1;
        double second = 2.2;
        System.out.println("Permutation of variable values using the third variable");
        System.out.println("Initial values of variables:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        double tmp = first;
        first = second;
        second = tmp;
        System.out.println("New variable values:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        first = 1.1;
        second = 2.2;
        System.out.println("Permutation of variable values using arithmetic operations");
        System.out.println("Initial values of variables:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        first += second;
        second = first - second;
        first -= second;
        System.out.println("New variable values:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        first = 1.1;
        second = 2.2;
        System.out.println("Permutation of variable values using a bitwise operation ^");
        System.out.println("Initial values of variables:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        int intFirst = (int) (first * 10);
        int intSecond = (int) (second * 10);
        intFirst ^= intSecond;
        intSecond ^= intFirst;
        intFirst ^= intSecond;
        first = (double) intFirst / 10;
        second = (double) intSecond / 10;
        System.out.println("New variable values:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
 
        System.out.println("\n6. Output of symbols and their codes");
        int one = 35, two = 38, three = 64, four = 94, five = 95;
        System.out.println(one + " " + (char) one);
        System.out.println(two + " " + (char) two);
        System.out.println(three + " " + (char) three);
        System.out.println(four + " " + (char) four);
        System.out.println(five + " " + (char) five);

        System.out.println("\n7. Product and sum of digits of a number");
        int number = 345;
        int alpha = number / 100;
        int beta = number % 100 / 10;
        int gamma = number % 10;
        int summa = alpha + beta + gamma;
        int product = alpha * beta * gamma;
        System.out.println("The sum of the digits of the number N = " + summa);
        System.out.println("The product of the digits of the number N = " + product);

        System.out.println("\n8. Output to the ASCII console-art Duke");
        char s = '/', b = '\\', u = '_', o = '(', c = ')', w = ' ';
        System.out.println("" + w + w + w + w + s + b);
        System.out.println("" + w + w + w + s + w + w + b);
        System.out.println("" + w + w + s + u + o + w + c + b);
        System.out.println("" + w + s + w + w + w + w + w + w + b);
        System.out.println("" + s + u + u + u + u + s + b + u + u + b);


        System.out.println("\n9. Displaying the number of hundreds, tens and units of a number");
        number = 123;
        x = number / 100;
        y = number % 100 / 10;
        int z = number % 10;
        System.out.println(x + " hundreds");
        System.out.println(y + " tens");
        System.out.println(z + " units");

        System.out.println("\n10. Converting Seconds");
        int seconds = 86399;
        String hh = Integer.toString(seconds / 3600);
        String mm = Integer.toString(seconds % 60 / 60);
        String ss = Integer.toString(seconds % 60);
        hh = (hh.length() == 2) ? hh : ("0" + hh);
        mm = (mm.length() == 2) ? mm : ("0" + mm);
        ss = (ss.length() == 2) ? ss : ("0" + ss); 
        System.out.println(hh + ":" + mm + ":" + ss);
        }
}