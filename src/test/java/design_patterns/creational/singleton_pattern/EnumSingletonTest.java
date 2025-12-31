package design_patterns.creational.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumSingletonTest {

    @Test
    void testEnumSingleton() {
        EnumSingleton singletonInstance1 = EnumSingleton.INSTANCE;
        EnumSingleton singletonInstance2 = EnumSingleton.INSTANCE;
        assertEquals(singletonInstance1, singletonInstance2, "Both instances should be the same");
    }
}
