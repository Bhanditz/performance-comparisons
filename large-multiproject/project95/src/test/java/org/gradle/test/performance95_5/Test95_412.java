package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_412 {
    private final Production95_412 production = new Production95_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}