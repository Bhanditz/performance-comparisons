package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_461 {
    private final Production65_461 production = new Production65_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}