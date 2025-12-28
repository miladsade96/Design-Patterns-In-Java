package design_patterns.creational.singleton_pattern;

// Eager Initialization
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        if (instance != null) {
            throw new RuntimeException("Please use getInstance() method!");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
