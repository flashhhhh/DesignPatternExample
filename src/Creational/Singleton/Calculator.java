package Creational.Singleton;

/**
 * You just want to have one instance of a calculator.
 */

public class Calculator {
    private static Calculator instance = null;

    private Calculator() {

    }

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }

        return instance;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }
}