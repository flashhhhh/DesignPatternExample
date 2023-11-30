package Creational.Prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Computer computer1 = new Computer("Intel Core i7", "8GB", "1TB");
        System.out.println(computer1);

        Computer computer2 = (Computer) computer1.clone();
        System.out.println(computer2);

        Computer computer3 = (Computer) computer1.clone();
        computer3.setCpu("Intel Core i5");
        computer3.setRam("4GB");
        System.out.println(computer3);
    }
}