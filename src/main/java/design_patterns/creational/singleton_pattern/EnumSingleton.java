package design_patterns.creational.singleton_pattern;

public enum EnumSingleton {
    INSTANCE;

    public void someMethod() {
        // Implementation of some method
        System.out.println("Method called on Enum Singleton instance.");
    }
}
