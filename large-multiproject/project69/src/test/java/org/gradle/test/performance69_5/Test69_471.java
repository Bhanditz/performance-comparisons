package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_471 {
    private final Production69_471 production = new Production69_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}