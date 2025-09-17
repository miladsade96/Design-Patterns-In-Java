package design_patterns.creational.factory_method_pattern.sample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        log.info("ConcreteProductA doSomething");
    }
}
