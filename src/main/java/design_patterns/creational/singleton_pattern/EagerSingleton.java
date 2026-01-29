package design_patterns.creational.singleton_pattern;

import lombok.Getter;

// Eager Initialization Singleton Pattern
// Pros: Simple to implement, thread-safe without synchronization overhead
// Cons: Instance is created even if it might not be used, leading to potential resource wast
public class EagerSingleton {

    @Getter
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent instantiation
    }

}
