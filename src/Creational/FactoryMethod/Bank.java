package Creational.FactoryMethod;

public abstract class Bank {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public abstract String getBankName();
    public String getInfo() {
        return "Account Number: " + accountNumber + "\nAccount Holder Name: " + accountHolderName + "\nBalance: " + balance;
    }
}