package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_161 {
    private final Production45_161 production = new Production45_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}