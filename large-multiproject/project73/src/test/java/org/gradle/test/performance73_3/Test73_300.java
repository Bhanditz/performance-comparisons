package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_300 {
    private final Production73_300 production = new Production73_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}