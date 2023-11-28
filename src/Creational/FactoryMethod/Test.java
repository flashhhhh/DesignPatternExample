package Creational.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("Vietcombank");
        System.out.println(bank.getBankName());
    }
}