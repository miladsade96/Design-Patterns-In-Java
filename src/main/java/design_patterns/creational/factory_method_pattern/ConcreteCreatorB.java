package design_patterns.creational.factory_method_pattern;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB(); // Create and return an instance of ConcreteProductB
    }
}
