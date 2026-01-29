package design_patterns.creational.singleton_pattern;


// Thread-Safe Singleton Pattern
// Pros: Safe to use in multithreaded environments
// Cons: Slightly slower due to synchronization overhead
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // Private constructor to prevent instantiation
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
