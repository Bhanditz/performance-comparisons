package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_79 {
    private final Production65_79 production = new Production65_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}