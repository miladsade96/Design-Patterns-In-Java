package design_patterns.creational.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        config.set("app_name", "MyApplication");
        System.out.println("App Name: " + config.get("app_name"));

        ConfigManager anotherConfig = ConfigManager.getInstance();
        System.out.println("App Name from another reference: " + anotherConfig.get("app_name"));


        // Eager Initialization:
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("eagerSingleton1: " + eagerSingleton1.hashCode());
        System.out.println("eagerSingleton2: " + eagerSingleton2.hashCode());
        System.out.println("Eager singletons are the same instance: " + (eagerSingleton1 == eagerSingleton2));

        // Lazy Initialization:
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("lazySingleton1: " + lazySingleton1.hashCode());
        System.out.println("lazySingleton2: " + lazySingleton2.hashCode());
        System.out.println("Lazy singletons are the same instance: " + (lazySingleton1 == lazySingleton2));

        // Thread-Safe Singleton:
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("threadSafeSingleton1: " + threadSafeSingleton1.hashCode());
        System.out.println("threadSafeSingleton2: " + threadSafeSingleton2.hashCode());
        System.out.println("Thread-safe singletons are the same instance: " + (threadSafeSingleton1 == threadSafeSingleton2));

        // Double-Checked Locking Singleton:
        DoubleCheckedLockingSingleton doubleCheckedSingleton1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedSingleton2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("doubleCheckedSingleton1: " + doubleCheckedSingleton1.hashCode());
        System.out.println("doubleCheckedSingleton2: " + doubleCheckedSingleton2.hashCode());
        System.out.println("Double-checked locking singletons are the same instance: " + (doubleCheckedSingleton1 == doubleCheckedSingleton2));
        

    }
}
