package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_461 {
    private final Production30_461 production = new Production30_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}