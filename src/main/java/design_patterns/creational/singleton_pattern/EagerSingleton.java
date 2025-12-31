package design_patterns.creational.singleton_pattern;

import lombok.Getter;

// Eager Initialization
public class EagerSingleton {

    @Getter
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent instantiation
    }

}
