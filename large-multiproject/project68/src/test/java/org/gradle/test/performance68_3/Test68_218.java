package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_218 {
    private final Production68_218 production = new Production68_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}