package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_175 {
    private final Production65_175 production = new Production65_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}