package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_212 {
    private final Production73_212 production = new Production73_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}