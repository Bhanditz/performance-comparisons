package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_300 {
    private final Production38_300 production = new Production38_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}