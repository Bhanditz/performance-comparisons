package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_114 {
    private final Production74_114 production = new Production74_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}