package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_63 {
    private final Production45_63 production = new Production45_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}