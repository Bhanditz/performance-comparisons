package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_188 {
    private final Production20_188 production = new Production20_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}