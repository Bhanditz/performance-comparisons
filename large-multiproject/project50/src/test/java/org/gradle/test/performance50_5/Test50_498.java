package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_498 {
    private final Production50_498 production = new Production50_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}