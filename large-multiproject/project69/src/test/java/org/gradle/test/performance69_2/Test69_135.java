package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_135 {
    private final Production69_135 production = new Production69_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}