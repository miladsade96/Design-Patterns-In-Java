package design_patterns.creational.factory_method_pattern.sample;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void doWork() {
        Product product = factoryMethod();
        product.doSomething();
    }
}
