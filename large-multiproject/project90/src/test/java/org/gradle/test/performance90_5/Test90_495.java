package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_495 {
    private final Production90_495 production = new Production90_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}