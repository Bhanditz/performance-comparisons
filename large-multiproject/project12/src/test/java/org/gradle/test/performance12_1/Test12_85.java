package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_85 {
    private final Production12_85 production = new Production12_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}