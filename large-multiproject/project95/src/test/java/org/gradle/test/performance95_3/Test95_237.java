package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_237 {
    private final Production95_237 production = new Production95_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}