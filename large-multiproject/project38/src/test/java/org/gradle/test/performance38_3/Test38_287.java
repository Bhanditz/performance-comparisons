package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_287 {
    private final Production38_287 production = new Production38_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}