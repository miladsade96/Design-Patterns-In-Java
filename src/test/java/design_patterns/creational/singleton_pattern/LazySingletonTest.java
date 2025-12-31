package design_patterns.creational.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LazySingletonTest {

    @Test
    void testLazySingleton() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        assertEquals(
                instance1.hashCode(), instance2.hashCode(),
                "Both instances should have the same hash code, indicating they are the same instance."
        );
    }
}
