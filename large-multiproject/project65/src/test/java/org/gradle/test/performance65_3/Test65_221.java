package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_221 {
    private final Production65_221 production = new Production65_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}