package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_313 {
    private final Production12_313 production = new Production12_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}