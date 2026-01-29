package design_patterns.creational.singleton_pattern;

// Bill Pugh Singleton Implementation
// Pros: Thread-safe, lazy initialization, efficient
// Cons: More complex than eager initialization
public class BillPughSingleton {

    private BillPughSingleton() {
        // private constructor to prevent instantiation)
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
