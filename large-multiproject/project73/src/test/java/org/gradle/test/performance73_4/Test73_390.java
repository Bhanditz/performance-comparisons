package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_390 {
    private final Production73_390 production = new Production73_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}