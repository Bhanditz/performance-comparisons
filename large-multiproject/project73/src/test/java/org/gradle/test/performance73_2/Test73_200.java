package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_200 {
    private final Production73_200 production = new Production73_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}