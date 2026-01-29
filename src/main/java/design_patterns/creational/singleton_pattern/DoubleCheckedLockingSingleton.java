package design_patterns.creational.singleton_pattern;


/* * Double-Checked Locking Singleton Pattern
 *
 * Pros: Thread-safe, lazy initialization, better performance than synchronized method.
 * Cons: More complex implementation, requires volatile keyword to ensure visibility.
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
        // Private constructor to prevent instantiation
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
