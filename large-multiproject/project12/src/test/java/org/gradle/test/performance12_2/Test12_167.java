package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_167 {
    private final Production12_167 production = new Production12_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}