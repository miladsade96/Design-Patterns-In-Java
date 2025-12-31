package design_patterns.creational.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillPughSingletonTest {

    @Test
    void testSingletonInstance() {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        assertEquals(instance1.hashCode(), instance2.hashCode(), "Both instances should have the same hash code");
    }
}
