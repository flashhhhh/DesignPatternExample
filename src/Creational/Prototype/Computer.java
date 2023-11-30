package Creational.Prototype;

public class Computer implements Cloneable {
    private String cpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String toString() {
        return "Computer: " + cpu + " " + ram + " " + storage;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}