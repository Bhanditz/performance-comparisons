package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_224 {
    private final Production12_224 production = new Production12_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}