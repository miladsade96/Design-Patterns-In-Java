package design_patterns.creational.factory_method_pattern.sample;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();  // Create and return an instance of ConcreteProductA
    }
}
