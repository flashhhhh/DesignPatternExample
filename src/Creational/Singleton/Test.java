package Creational.Singleton;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getInstance();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.divide(1, 2));
    }
}