package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_82 {
    private final Production43_82 production = new Production43_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}