package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_367 {
    private final Production79_367 production = new Production79_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}