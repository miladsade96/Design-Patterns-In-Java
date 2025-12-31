package design_patterns.creational.singleton_pattern;

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
