package design_patterns.creational.singleton_pattern;

import org.junit.jupiter.api.Test;

class ThreadSafeSingletonTest {

    @Test
    void testThreadSafeSingleton() {
        ThreadSafeSingleton singletonInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton singletonInstance2 = ThreadSafeSingleton.getInstance();
        assert singletonInstance1.hashCode() == singletonInstance2.hashCode() : "Both instances should be the same";
    }
}
