package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_46 {
    private final Production90_46 production = new Production90_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}