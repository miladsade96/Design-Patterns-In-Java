package design_patterns.creational.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleCheckedLockingSingletonTest {

    @Test
    void testSingletonInstance() {
        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton instance2 = DoubleCheckedLockingSingleton.getInstance();

        assertEquals(instance1.hashCode(), instance2.hashCode(), "Both instances should have the same hash code");
    }
}
