package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_399 {
    private final Production33_399 production = new Production33_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}