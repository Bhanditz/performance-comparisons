package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_382 {
    private final Production68_382 production = new Production68_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}