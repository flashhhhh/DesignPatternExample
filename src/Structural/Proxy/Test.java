package Structural.Proxy;

public class Test {
    public static void main(String[] args) {
        Video jom_and_terry = new ProxyVideo("https://www.youtube.com/watch?v=t0Q2otsqC4I");

        // First time clicking to this video, u must wait this video loaded.
        jom_and_terry.display();

        // Second time clicking to this video, u don't need to wait.
        jom_and_terry.display();
    }
}