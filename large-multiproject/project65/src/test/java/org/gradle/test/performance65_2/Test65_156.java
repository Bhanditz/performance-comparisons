package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_156 {
    private final Production65_156 production = new Production65_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}