package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_253 {
    private final Production49_253 production = new Production49_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}