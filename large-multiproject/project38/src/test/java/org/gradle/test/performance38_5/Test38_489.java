package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_489 {
    private final Production38_489 production = new Production38_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}