package design_patterns.creational.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EagerSingletonTest {

    @Test
    void testEagerSingletonInstance() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        assertEquals(instance1.hashCode(), instance2.hashCode(), "Both instances should be the same");
    }

}