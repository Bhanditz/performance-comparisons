package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_247 {
    private final Production33_247 production = new Production33_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}