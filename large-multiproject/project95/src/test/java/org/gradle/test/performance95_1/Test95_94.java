package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_94 {
    private final Production95_94 production = new Production95_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}