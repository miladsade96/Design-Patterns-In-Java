package design_patterns.creational.singleton_pattern;


// Lazy Initialization Singleton Pattern
// Pros: Instance is created only when needed, saving resources
// Cons: Not thread-safe without additional synchronization
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // Private constructor to prevent instantiation
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
