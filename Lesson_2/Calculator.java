package Lesson_2;


public  class Calculator {
    public static double calc(int a, char mathOperation, int b) {
        double result = 0;
        switch (mathOperation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^': {
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
            }
        }
        return result;
    }
}
