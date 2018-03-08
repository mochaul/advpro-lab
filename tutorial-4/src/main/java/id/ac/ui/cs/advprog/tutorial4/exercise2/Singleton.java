package id.ac.ui.cs.advprog.tutorial4.exercise2;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return singleton;
    }
}