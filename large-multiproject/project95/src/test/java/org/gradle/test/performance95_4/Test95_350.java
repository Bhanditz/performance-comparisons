package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_350 {
    private final Production95_350 production = new Production95_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}