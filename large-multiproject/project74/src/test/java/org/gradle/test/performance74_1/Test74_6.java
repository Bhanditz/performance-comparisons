package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_6 {
    private final Production74_6 production = new Production74_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}