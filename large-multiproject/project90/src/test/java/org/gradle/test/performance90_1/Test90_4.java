package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_4 {
    private final Production90_4 production = new Production90_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}