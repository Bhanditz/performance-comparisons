package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_9 {
    private final Production79_9 production = new Production79_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}