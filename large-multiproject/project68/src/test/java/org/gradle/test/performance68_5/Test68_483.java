package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_483 {
    private final Production68_483 production = new Production68_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}