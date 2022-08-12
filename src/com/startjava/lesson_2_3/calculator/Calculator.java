package src.startjava.lesson_2_3.calculator;

public  class Calculator {
    public double calc(int a, char mathOperation, int b) {
        double result = 0;
        switch (mathOperation) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            case '%': return a % b;
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
