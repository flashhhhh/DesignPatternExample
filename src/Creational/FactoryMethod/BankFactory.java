package Creational.FactoryMethod;

/**
 * You want to create a new bank account but don't want anyone to know the bank's constructor.
 */
public class BankFactory {
    /**
     * you can create a new bank account in bankName bank.
     */
    public static final Bank getBank(String bankName) {
        switch (bankName) {
            case "Vietcombank":
                return new Vietcombank();
            case "VPBank":
                return new VPBank();
            case "Vietinbank":
                return new Vietinbank();
            default:
                throw new IllegalArgumentException("This bank is unsupported!");
        }
    }
}