package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_215 {
    private final Production69_215 production = new Production69_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}