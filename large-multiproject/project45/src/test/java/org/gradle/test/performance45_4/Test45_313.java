package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_313 {
    private final Production45_313 production = new Production45_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}