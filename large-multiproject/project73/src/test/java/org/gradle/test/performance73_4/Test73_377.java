package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_377 {
    private final Production73_377 production = new Production73_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}