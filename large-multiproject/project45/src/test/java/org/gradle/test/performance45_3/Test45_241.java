package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_241 {
    private final Production45_241 production = new Production45_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}