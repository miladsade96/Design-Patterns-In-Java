package design_patterns.creational.factory_method_pattern.sample;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.doWork();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.doWork();
    }
}
