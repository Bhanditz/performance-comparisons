package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_73 {
    private final Production12_73 production = new Production12_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}