package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_84 {
    private final Production51_84 production = new Production51_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}